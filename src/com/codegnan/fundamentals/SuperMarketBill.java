
package com.codegnan.fundamentals;

import java.util.Scanner;

public class SuperMarketBill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the principle amount:");
		double principleAmount= sc.nextDouble();
		System.out.println("enter the time:");
		double time =sc.nextDouble();
		System.out.println("rate of interest in %");
		double rate = sc.nextDouble();
		
		
		double si=(principleAmount*time*rate);
		System.out.println("the simple intrest is:"+si);
		double total=si+principleAmount;
		System.out.println("the total amount is :"+total);
		sc.close();
		
	}

}
