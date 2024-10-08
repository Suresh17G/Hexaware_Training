package Junit;

public class Author {

	private String authorid;
	private String authorname;
	
	public Author() {
		
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + "]";
	}
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
}
