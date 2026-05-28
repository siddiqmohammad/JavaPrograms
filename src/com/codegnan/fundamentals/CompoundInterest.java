package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the principle amount  value");
	double PrincipleAmount= s.nextDouble();
	System.out.println("enter the rate of intrest:");
	double rate=s.nextDouble();
	System.out.println("enter the time:");
	int time=s.nextInt();
	double amount =PrincipleAmount*(Math.pow(1+(rate/100), time));
	System.out.println("the amount is:" +amount);
    s.close();
		}
		}
		


