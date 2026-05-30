package com.codegnan.fundamentals;

import java.util.Scanner;

public class VoteCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a= sc.nextInt();
		String TypeOfNumber=(a%2==0)?"even":"odd";
		System.out.println("the given number is :"+TypeOfNumber);
		sc.close();
		
		
		
		

	}

}
