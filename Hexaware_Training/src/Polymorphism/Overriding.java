package Polymorphism;

public class Overriding extends Overloading {

	@Override
	public void sum(int x, int y)
	{
		System.out.println("sum is: " + (x+y));
	}
}
