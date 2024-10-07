package MysqlConnection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
public class JdbcExternalFileSample {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		properties.load(fis);

		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		String driver = properties.getProperty("jdbc.driver");

		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("insert into author values(?,?)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter author id:");
		String authorid = scanner.nextLine();
		System.out.print("Enter author name:");
		String authorname = scanner.nextLine();
		ps.setString(1, authorid);
		ps.setString(2, authorname);
		int x = ps.executeUpdate();
		System.out.println(x + "row(s) inserted");
		connection.close();
	}
}
