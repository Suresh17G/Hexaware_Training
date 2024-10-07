package MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_management", "root","1234");
		conn.setAutoCommit(false);
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Sender Account no:");
		int Sender_accno=sc.nextInt();
		System.out.print("Enter Receiver Account no:");
		int Receiver_accno=sc.nextInt();
		System.out.print("Enter amount to be transferred:");
		int amount=sc.nextInt();
		
		PreparedStatement stmt = conn.prepareStatement("UPDATE bank_account SET balance = balance - ? WHERE bank_accno = ?");
		stmt.setInt(1, amount);
		stmt.setInt(2, Sender_accno);
		stmt.addBatch(); // Add sender's update to the batch

		// Add amount to Receiver's balance
		//stmt = conn.prepareStatement("UPDATE bank_account SET balance = balance + ? WHERE bank_accno = ?");
		stmt.setInt(1, amount*(-1));
		stmt.setInt(2, Receiver_accno);
		stmt.addBatch(); // Add receiver's update to the batch

		// Execute batch for both sender and receiver
		int[] out = stmt.executeBatch();
		if (out[0] > 0 && out[1] > 0) {
			conn.commit();
			System.out.println("Amount transferred successfully!!");
		} else {
			conn.rollback();
			System.out.println("Something went wrong!!\n Please try again with correct information!!");
		}

	}

}
