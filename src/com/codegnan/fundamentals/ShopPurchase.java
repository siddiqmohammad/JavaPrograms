package com.codegnan.fundamentals;

import java.util.Scanner;

public class ShopPurchase {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter th intial price");
	int initialPrice=sc.nextInt();
	System.out.println("enter th Discount amount:");
	int DiscountAmount=sc.nextInt();
	System.out.println("enter th surcharge amount:");
	int Surcharge=sc.nextInt();
	System.out.println("enter th target Budget:");
	int Budget=sc.nextInt();
    int updatedPrice=(initialPrice-DiscountAmount+Surcharge);
    System.out.println("final cost is :"+updatedPrice);
    boolean budgetRange=updatedPrice>0 && updatedPrice<=Budget;
    System.out.println(updatedPrice);
    System.out.println("you have enough budget >>>>>budget lekapote pora bayatakiii:"+budgetRange);
    

    sc.close();
    

	
	
	
	}

}
