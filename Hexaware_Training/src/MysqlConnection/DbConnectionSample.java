package MysqlConnection;

import java.sql.*;

public class DbConnectionSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class is loaded!");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management?user=root&password=1234");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management", "root", "1234");
		System.out.println("Connection is made!");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("Insert into author values('A006','Jaden Smith')");
		System.out.println("Inserted into author!!");
		//stmt.executeUpdate("DELETE FROM author WHERE author_id='A006'");
		//System.out.println("Deleted from author!!");
	
		stmt.executeUpdate("DELETE FROM book WHERE author_id='A005'");
		System.out.println("Deleted from book!!");
		//stmt.execute("Insert into book values(105,'To Kill a Mockingbird','A005','P004','G02')");
		//System.out.println("Inserted into book!!");
		
		con.close();
	}
}
