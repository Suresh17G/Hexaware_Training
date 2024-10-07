package Exceptionhandling;

//called program
public class throwsSample {
	
	//called function
	public void division() throws ArithmeticException
	{
		int x= 100,y=0;
		int z = x/y;
		System.out.println(z);
	}

}