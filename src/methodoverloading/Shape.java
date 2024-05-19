package methodoverloading;

class Area{
	double Area;
	public void shape_area(float l, float b) {
		Area = l * b;
		System.out.println("Area of Rectangle is "  +Area);
	}
	
	public void Shape_area(float sq) {
		Area = sq * sq;
		System.out.println("Area of Square is " +Area);
	}
}

public class Shape {
         public static void main(String[] args) {
        	 Area obj = new Area();
        	 obj.Shape_area(3*7);
        	 obj.Shape_area(3);
        	 
        	 
         }
}
