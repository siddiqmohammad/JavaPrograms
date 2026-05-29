package com.codegnan.fundamentals;

import java.util.Scanner;

public class Profitshare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int investmentA=sc.nextInt();
		int monthsA =sc.nextInt();
		int investmentB=sc.nextInt();
		int monthsB =sc.nextInt();
		int joinedAterMonthsofA=sc.nextInt();
		int effectiveA=investmentA*monthsA;
		int monthsB=12-joinedAterMonthsofA;
		int effectiveB=investmentB*monthsB;
		int totalRatio=effectiveA+effectiveB;
		double bshare=((double)effectiveB/totalratio))*profit;
		System.out.println("b share:",+bShare);
		sc.close();
		
		
		
		
		
		
		
	}

}
