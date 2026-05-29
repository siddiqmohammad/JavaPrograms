package com.codegnan.fundamentals;

import java.util.Scanner;

public class GamerScore {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base value");
		int basevalue= sc.nextInt();
		System.out.println("enter the bonus value");
		int bonus= sc.nextInt();
		int result=2*(basevalue+bonus);
		boolean isfinalTotal=(result>50 && bonus%2!=0);
		System.out.println("The doubled total score:"+result);
		System.out.println("The final total is :"+isfinalTotal);
		sc.close();
		
		
		
	}

}
