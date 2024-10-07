package Polymorphism;

public class Overloading {

	public void sum(int x, int y)
	{
		System.out.println("integer sum: " + (x+y));
	}
	
	public void sum(double x, double y)
	{
		System.out.println("double sum: " + (x+y));
	}
	
	public static void main(String[] args) {
		
		Overloading obj ; 
		obj = new Overloading();
		obj.sum(4, 5);
		obj.sum(5.6, 4.5);
	}
}
