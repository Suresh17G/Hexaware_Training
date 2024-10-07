package Exceptionhandling;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int productWeight = s.nextInt();

		MajorAge test5 = new MajorAge();
		test5.checkProudct(productWeight);
	}

}