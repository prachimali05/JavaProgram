package abstarction;

abstract class Bike {
	Bike(){
		System.out.println("Bike is created");
	}
	
	abstract void run();
	void changegear() {
		System.out.println("Gear changed");
	}
}	
	class Honda extends Bike{
		void run() {
			System.out.println("Running safely");
		}
	}
	

public class Abstract_Class {
      public static void main(String[] args) {
    	  Bike obj = new Honda();
    	  obj.run();
    	  obj.changegear();
      }
}
