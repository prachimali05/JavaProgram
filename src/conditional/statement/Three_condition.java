package conditional.statement;

import java.util.Scanner;

public class Three_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x == y) {
			System.out.println("The numbers are equal");
		} else {
			if(x > y) {
				 System.out.println("X is greater");
			}
			else {
				System.out.println("X is lesser");
			}
		}

	}

}
