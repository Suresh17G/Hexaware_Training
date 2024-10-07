package Interface;

public class Circle implements Main_interface {
	double R;
	Circle(double R){
		this.R=R;
	}
	public double area() {
	
		return PI*R*R;
	}
}
