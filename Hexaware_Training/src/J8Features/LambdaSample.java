package J8Features;

public class LambdaSample {

	//void sum(int x, int y);
	public static void main(String[] args) {
		
		
		FunctionalInterfaceSample obj = (x,y)->System.out.println(x+y);
		obj.sum(3, 5);
	}
}