package Java_Day1;

public class datatypes {
	static int customerid;
	String C_name="Sanjay";
	boolean ordered;
	static double Totalvalue;
	public void placeorder() {
		ordered=true;
		System.out.println("Order placed successfully for: "+C_name);
	}
	
	public static double pay(double amount) {
		float startamount=(float)amount*10;
		Totalvalue+=startamount;
		return Totalvalue;
	}
	public static void main(String[] args) {
		customerid=2;
		System.out.println(customerid);
		datatypes obj1=new datatypes();
		System.out.println("Customer name: "+obj1.C_name);
		new datatypes().placeorder();
		System.out.println("Current order amount: "+pay(1234));
	}
}
