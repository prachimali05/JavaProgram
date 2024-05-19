package inheritance;

class AA {
	int a = 5;
	public void display() {
		System.out.println(" a = " +a);
	}
}

class BB extends AA {
	int a = 10 , ans;
	
	public void add() {
		ans = super.a+a;
	}
	
	public void display() {
		super.display();
		System.out.println("add is" +ans);
	}
	
}

public class Super_Keyword {
     public void main(String[] args) {
    	 BB obj = new BB();
    	 obj.add();
    	 obj.display();
     
    	 
     }
}
