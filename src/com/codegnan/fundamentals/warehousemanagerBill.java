package com.codegnan.fundamentals;

import java.util.Scanner;

public class warehousemanagerBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the unit price:");
		double unitPrice=sc.nextInt();
		System.out.println("enter the quantity:");
		int Quantity=sc.nextInt();
		System.out.println("enter the budget:");
		double budget=sc.nextInt();
		double FinalValue=unitPrice*Quantity;
		FinalValue+=0.1*FinalValue;
		boolean canhebuy= FinalValue<=budget && Quantity>=1;
		System.out.println(FinalValue);
		System.out.println(canhebuy);
		sc.close();
		


	}

}
