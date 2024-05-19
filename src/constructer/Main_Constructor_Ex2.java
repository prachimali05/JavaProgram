package constructer;

class Demo{
	int x;
	int y;
	
	Demo()
	{
		x=7;
		y=8;
	}
	public void display() {
		System.out.println("The value of x:" +x);
		System.out.println("The value of y:" +y);
		}
}

public class Main_Constructor_Ex2 {
	
	public static void main(String[] args) {
		
		Demo x = new Demo();
		x.display();
	}

}
