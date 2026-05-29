package com.codegnan.fundamentals;

import java.util.Scanner;


public class Bankdeposit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int InitialBalance=sc.nextInt();
		int deposit= sc.nextInt();
		int balance = InitialBalance+deposit;
		boolean isEvenAndGreater1000= (balance>1000) && (balance%2==0);
		System.out.println(InitialBalance);
		System.out.println(deposit);
		System.out.println(balance);
		System.out.println(isEvenAndGreater1000);
		sc.close();
		
		
		
	}

}
