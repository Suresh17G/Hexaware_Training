package MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management", "root", "1234");
		Statement stmt=conn.createStatement();
		stmt.addBatch("insert into author values('A006','Micheal smith')");
		stmt.addBatch("insert into author values('A007','Micheal smith')");
		stmt.addBatch("insert into author values('A008','Ed Taylor')");
		stmt.addBatch("update author set author_name='Ross Wilson' where author_id like'A006'");
		stmt.addBatch("delete from author where author_id like 'A001'");
		int out[]=stmt.executeBatch();
		for(int i:out) {
			System.out.println(i+"update(s)in Author table");
		}
		
	}
}
