package com.codegnan.fundamentals;

import java.util.Scanner;

public class simpleIntrestCalculater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		double p = sc.nextDouble();

		System.out.println("Enter the time:");
		double time = sc.nextDouble();

		System.out.println("Enter the rate:");
		double rate = sc.nextDouble();

		double si = (p * time * rate) / 100;

		System.out.println("Simple Interest is: " + si);

		sc.close();
	}
}
