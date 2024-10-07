package MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DbPreparedStatementSample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class is loaded!");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management", "root", "1234");
		System.out.println("Connection is made!");
		PreparedStatement preparedstmt=con.prepareStatement("SELECT * FROM author where author_id like ?");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Author Id: ");
		String id=sc.next();
		
		preparedstmt.setString(1, id);
		
		ResultSet Rset=preparedstmt.executeQuery();
		System.out.println("\nAuthor_ID   |    Author_Name");
		while(Rset.next()) {
		String AuthorID=Rset.getString(1);
		String AuthorName=Rset.getString(2);
			System.out.println(AuthorID+" 	  |  "+AuthorName);
		}
		
	
		con.close();
	}

}
