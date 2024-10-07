package Exceptionhandling;

public class MajorAge {

	public void checkProudct(int age) {
		if (age >= 18) {
			System.out.println("Age is valid for voting");
		} else {
			try {
				throw new UserDefinedException();
			} catch (UserDefinedException ip) {
				System.out.println("Invalid Age: Minors can't vote!!");
			}
		}
	}

}