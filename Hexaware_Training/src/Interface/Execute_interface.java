package Interface;

public class Execute_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_interface circle = new Circle(3);
		System.out.println("Area of Circle: " + circle.area());
		Main_interface rectangle = new Rectangle(3,5);
		System.out.println("Area of Rectangle: " + rectangle.area());
		
	}

}
