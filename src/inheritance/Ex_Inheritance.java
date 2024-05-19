//Single inheritence

package inheritance;

class A {
	int a;
	int b;
	public void input(int x,int y) {
		a = x;
		b = y;
	}	
}

class B extends A {
	public void display() {
		int sum = a+b;
		System.out.println("Sum is" +sum);	
	}
}

public class Ex_Inheritance { 
	public static void main(String[] args) {
   B obj = new B();
   obj.input(4,5);
   obj.display();
	}
}
