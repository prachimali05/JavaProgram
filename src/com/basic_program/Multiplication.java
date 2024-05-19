package com.basic_program;

import java.util.Scanner;

public class Multiplication {
     public static void main(String args[])
     {
    	 int no1 , no2;
    	 int ans=0;
    	 Scanner obj=new Scanner(System.in);
    	 System.out.println("Enter the 1st Number");
    	 no1 = obj.nextInt();
    	 System.out.println("Enter the 2st Number");
    	 no2 = obj.nextInt();
    	 while(no2!=0)
    	 {
    		 ans=ans+no1;
    		 no2--;
    	 }
    	 
    	 System.out.println("Answer is " +ans);
     }
     
}
