package com.codegnan.fundamentals;

import java.util.Scanner;

public class TempConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value in F:");
		double fahrenhiet = sc.nextDouble();
		
		double celsius=(fahrenhiet*9/5+32);
		System.out.println("The temperature in celsius is :"+celsius);
		sc.close();
		// TODO Auto-generated method stub

	}

}
