package string;

public class Palindrome {
	public static void main(String[] args) {
		String str="Naman";
		String revname = "";
        char ch;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			revname = ch + revname;
		}
	
		System.out.println(revname);
	}
	

}
