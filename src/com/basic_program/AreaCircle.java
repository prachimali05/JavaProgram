package com.basic_program;

import java.util.Scanner;

class Circle{
	float radius;
	double area;
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the r");
		radius = sc.nextFloat();
	}
	
	public void display_area() {
		area =(float) (3.14*radius*radius);
		System.out.println("The area of circle is " + area);
		}
}

public class AreaCircle {
	public static void main(String[] args)
	{
		Circle x = new Circle();
		x.accept();
		x.display_area();
	}

}
