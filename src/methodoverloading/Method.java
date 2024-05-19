package methodoverloading;

class Overload{
	public void sum(int x,int y) {
		System.out.println("Sum of two paramneters" +(x+y));
	}
	
	public void sum(int x,int y,int z) {
		System.out.println("Sum of two paramneters" +(x+y+z));
	}
	
	public void sum(int w,int x,int y,int z) {
		System.out.println("Sum of two paramneters" +(w+x+y+z));
	}
	
}

public class Method {
      public static void main(String[] args) {
    	  Overload x = new Overload();
    	  x.sum(2,3);
    	  x.sum(45,67,2);
    	  x.sum(2,3,8,9);
    	  
    	  
      }
}
