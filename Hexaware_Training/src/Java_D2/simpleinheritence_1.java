package Java_D2;

public class simpleinheritence_1 {
	

	//create the object for child class
	
	//Test2 obj = new Test2();
	//obj.sum(3, 4);
	//obj.sub(7,5);
	//child class object --> parent class object (upcasting)
	/*
	 * Test1 obj = new Test2(); obj.sum(3, 4); //obj.sub(7,6);
	 * 
	 * //parent to child conversion ( downcasting) Test2 obj1 = (Test2)new Test1();
	 * obj1.sub(3, 4);
	 */
	public static void main(String[] args) {

		int x= 100;
		//int->double (smaller -> higher)
		double y = x;
		System.out.println(y);
		//byte < short < int < long < float < double 
		
		double z = 127.285;//higher -> smaller
		byte i = (byte)z;
		System.out.println("double="+z+" byte="+i);
		double b = 128.285;//higher -> smaller
		byte j = (byte)b;
		System.out.println("double="+b+" byte="+j);
		double a = 129.285;//higher -> smaller
		byte k = (byte)a;
		System.out.println("double="+a+" byte="+k);



	}
}
