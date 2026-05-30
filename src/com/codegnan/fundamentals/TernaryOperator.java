package com.codegnan.fundamentals;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the number");
		int b = sc.nextInt();
		int GreatestNumber=(a>b)?a:b;
		System.out.println("the greatest number is :"+GreatestNumber);
		sc.close();
		
		
		
	}

}
