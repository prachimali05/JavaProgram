package oops;

 class Example_Test {
	public void show() {
		System.out.println("Show called");
	}
	
	public void add(int a, int b) {
		System.out.println("Addition is" + (a+b));
	
	}
 }
	
	public class Example{
		
		public static void main(String[] args) {
			
			Example_Test obj = new Example_Test();
			obj.show();
			obj.add(2, 2);
		}
	}


