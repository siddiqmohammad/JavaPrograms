package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscountUsingNestedTernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount amount");
		double Purchaseamount=sc.nextDouble();
		double discount=(Purchaseamount>100)?0.2:(Purchaseamount>50)?0.1:0;
		double Discountamount=Purchaseamount*discount;
		double remainingamount=Purchaseamount-Discountamount;
		System.out.println("Discount amount="+Discountamount);
		System.out.println("remainingAmount:"+remainingamount);
		sc.close();
		
	}

}
