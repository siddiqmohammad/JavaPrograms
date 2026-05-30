package com.codegnan.fundamentals;

import java.util.Scanner;

public class Eligibilitycheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		String result =(age>=18)?"eligible to vote":"not eligible to vote";
		System.out.println(result);
		sc.close();

	}

}
