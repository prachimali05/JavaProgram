package constructer;

class Constructor_Ex {
	public void display() {
		System.out.println("dis[aly Method called");
	}
	
	public Constructor_Ex() {
		System.out.println("Constructor method is called");
	}
}

public class Main_Constructor {
	public static void main(String[] args) {
		Constructor_Ex x=new Constructor_Ex();
		
	}

}
