package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the radius value:");
	float r = sc.nextFloat();
	double area=(3.14*r*r);
	System.out.println("the area of the circle:"+area);
	sc.close();
		// TODO Auto-generated method stub

	}

}
