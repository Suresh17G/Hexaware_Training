package Junit;

import java.sql.*;

public class DbConnectionSample {

	 public Connection getConnection(String url, String user, String password) throws SQLException {
	        return DriverManager.getConnection(url, user, password);
	    }
	 
	public Author getAuthor(String authorid,Connection con) {
		Author author=new Author();
		try {
			PreparedStatement stmt=con.prepareStatement("Select * from author where author_id like ?");
			stmt.setString(1, authorid);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				author.setAuthorid(rs.getString(1));
				author.setAuthorname(rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return author;	
	}
	public Author updateAuthor(String authorid,String authorname,Connection con) {
		Author author=new Author();
		try {
			PreparedStatement stmt=con.prepareStatement("update author set author_name=? where author_id like ?");
			stmt.setString(1, authorname);
			stmt.setString(2, authorid);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				author.setAuthorid(rs.getString(1));
				author.setAuthorname(rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return author;	
	}	
	
}
