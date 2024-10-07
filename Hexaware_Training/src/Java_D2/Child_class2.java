package Java_D2;

public class Child_class2 extends parent_class{
	public void mul(int x,int y) {
		System.out.println("Multiplied value= "+(x*y));
	}
	
	public static void main(String[] args) {

		Child_class2 obj1 =new Child_class2();
		obj1.sum(2,8);
		obj1.mul(3, 9);
		
		//upcasting
		parent_class obj2=new Child_class2();
		obj2.sum(12,48);
		//obj2.mul(32, 19); //Error
		
		//Downcasting
		Child_class2 obj3= (Child_class2) new parent_class();
		obj3.sum(32,8);
		//obj3.mul(2, 119);// runtime error : ClassCastException
	
	}
}
