package Exceptionhandling;

//calling program
public class throwsCallingFunction {

	//calling function
	public static void main(String[] args) {
		
		throwsSample test2 = new throwsSample();
		try {
		test2.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something is wrong in division method, check once");
		}
	}
}