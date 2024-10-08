package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDbConnection {

	private static DbConnectionSample dbConnection;
	private Connection con;
	@BeforeAll
	static void setUp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
        dbConnection = new DbConnectionSample();
	}
	@BeforeEach
	void setUpconnection() {
		String url = "jdbc:mysql://localhost:3306/bookstore_management";
        String user = "root"; 
        String password = "1234";
        try {
			con=dbConnection.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testgetAuthor() {
		Author author=dbConnection.getAuthor("A002", con);
		assertEquals("Robert Martin",author.getAuthorname());
	}
	 @AfterEach
	    void tearDown() {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }

}
