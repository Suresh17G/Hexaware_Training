package Interface;

public class Rectangle implements Main_interface {
	double L,D;
	Rectangle(double L,double D){
		this.L=L;
		this.D=D;
	}
	public double area() {
	
		return L*D;
	}
}
