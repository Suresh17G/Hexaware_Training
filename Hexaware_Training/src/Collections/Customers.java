package Collections;

public class Customers implements Comparable<Customers>{
	private Integer customerID;
	private String customerName;
	
	public Customers(Integer customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		return customerID+" | "+customerName;
		
	}
	@Override
	public int compareTo(Customers o) {
		// TODO Auto-generated method stub
		return this.getCustomerID().compareTo(o.customerID);
	}
}
