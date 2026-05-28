package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student ID:");
		int rollNumber=sc.nextInt();
		System.out.println("enter the student Name:");
		String name=sc.next();
        System.out.println("enter the student age:" );
        int age=sc.nextInt();
        System.out.println("enter the student grade:");
        char grade=sc.next().charAt(0);
        System.out.println("enter the student details:");
        System.out.println("--------------------------");
        System.out.println("rollnumber"+rollNumber);
        System.out.println("student name:"+name);
        System.out.println("student age:"+age);
        System.out.println(" student grade:"+grade);
        sc.close();
        
        sc.close();
		// TODO Auto-generated method stub

	}

}
