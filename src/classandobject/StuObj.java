package classandobject;

class Student {
		int rollno;
		String name;
		
		public void getdata(int x, String y) {
			rollno=x;
			name=y;
		}
		
		public void putdata() {
		 System.out.println("rollno:" +rollno);
		 System.out.println("name:"  +name );
	}
}

	class StuObj{
		
		public static void main(String[] args) {
			Student x = new Student();
			x.getdata(33, "Ruhi");
			x.putdata();
			
		}

	}


