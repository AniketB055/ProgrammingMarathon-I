package com.Kodnest.Training.infinilteloops;

import java.util.Scanner;

public class KCalcu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Kodnest Calculator");
		
		while(true)
		{
		System.out.println("+ --> Addition");
		System.out.println("- --> Subtraction");
		System.out.println("* --> Multiplication");
		System.out.println("/ --> Division");
		System.out.println("^ --> Square of Number");
		System.out.println("% --> Find Reminder");
		System.out.println("! --> Stop");
		char opt = scan.next().charAt(0);
		
		switch(opt)
		{
		case '+':
		{
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a+b ;
			System.out.println("Addition of given two number is "+c);
		    break;
		}
		case '-':
		{
			System.out.println("Enter two numbers");
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = a-b ;
		    System.out.println("Subtraction of given two number is "+c);
		    break;
		}
		case '*':
		{
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a*b ;
			System.out.println("Multiplication of given two number is "+c);
			break; 
		}	            
		case '/':
		{
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a/b ;
			System.out.println("Division of given two number is "+c);
			break;
		}
		case '%':
		{
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a%b ;
			System.out.println("Reminder of given two number is "+c);
			break;
		}	
		case '^':
		{
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int c = a^2 ;
			System.out.println("Addition of given two number is "+c);
			break;
		}
		case '!':
		{
			System.out.println("Please consult to the Eye Specialist");
			System.exit(0);
		}
		
		}
	  }
	}
}
