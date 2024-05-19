package abstarction;

interface Area {
	
	
	double compute (double l, double b);	
}

class Rectangle implements Area{
	public double compute (double l, double b)
	{
		return (l*b);
	}
	
}

class Triangle implements Area{
	public double compute (double l,  double b) {
		return (0.5*l*b);
	}
	
}
public class InterfaceArea {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		double area = rect.compute(10, 20);
		System.out.println(rect);
	}

}
