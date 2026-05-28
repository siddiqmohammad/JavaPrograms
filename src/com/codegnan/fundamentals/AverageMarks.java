package com.codegnan.fundamentals;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks in test 1:");
		int a = sc.nextInt();	
		System.out.println("enter the marks in test 2");
		int b = sc.nextInt();
		System.out.println("enter the marks in test 3:");
		int c = sc.nextInt();
	    int average=(int)(a+b+c)/3;
	    System.out.println("the average marks is:"+average);
	    sc.close();



	}

}
