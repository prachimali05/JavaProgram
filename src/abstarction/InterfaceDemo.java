package abstarction;

interface Shape{
	
	int length = 10;  // final & static variable
	int Bredth = 20;  // final & static variable
	
	void circle();  // abstract method
	
	default void square ()
	{
    System.out.println("This is Square - Default mtd");
    }
	static void rectangle () {
		System.out.println("This is Rectangle - Default mtd");
	}
	
	public class InterfaceDemo implements Shape {

		@Override
		public void circle() {
	System.out.println("This is circle -abstract  Mtd");
		
		}
		public static void main(String[] args) {
			
			//Scenario-1
			InterfaceDemo obj =new InterfaceDemo();
			obj.circle();//abstract  mtd
			obj.square(); //default  mtd  
			Shape.rectangle(); //static Mtd can directly 
							  //acces from Interface
			
			//Scenario-2
			Shape sh = new InterfaceDemo();
			sh.circle();
			sh.square();
			Shape.rectangle();  //static Mtd can directly 
			  					//acces from Interface
			
		}

}
}
	



