package Encapsulation;

public class Execute_encapsulation {
	
	public static void main(String[] args) {
		
		Main_class student = new Main_class();
		
	   student.setStid(100);
	   student.setStname("ram");
	   System.out.println("student id is: " + student.getStid());
	   System.out.println("student name is: " + student.getStname());
	}
}
