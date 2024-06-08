package basic_program;

//Print the number input by the user, n=2

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         for(int i=1;i<11;i++) {
        	 System.out.println(n*i);
         }
        		 
         
//         int mul=0;
//         
//         for(int i = 1;i<11;i++) {
//         mul = n*i;
//         System.out.println(mul);
//         }
         
         
	}
         

}
