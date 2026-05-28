package com.codegnan.fundamentals;

import java.util.Scanner;

public class Tempconversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int celsius=sc.nextInt();
		double fahrenhiet=(celsius*9/5)+32;
		System.out.println("Temperature in fahrehiet is:"+fahrenhiet);
		sc.close();	
		
		
		// TODO Auto-generated method stub

	}

}
