package Java_Day1;

public class constructor_Sample {
	
	int customerid;
	String C_name="Sanjay";
	boolean ordered;
	double Totalvalue=0;
	constructor_Sample(){
		System.out.println("Default Constructor!!");
		System.out.println("Provide customer and amount details to place order!!\n");
	}
	constructor_Sample(int id,String name,boolean yes,double Totalvalue){
		customerid=id;
		C_name=name;
		ordered=yes;
		this.Totalvalue=Totalvalue;
		System.out.println("Parameterized Constructor!!");
	}
	void placeorder() {
		System.out.println("Order placed by "+C_name+" for "+Totalvalue);
	}
	public static void main(String[] args) {
		constructor_Sample obj1=new constructor_Sample();
		constructor_Sample obj2=new constructor_Sample(5,"Ajay",true,5500.50);
		obj2.placeorder();
		
		}
}
