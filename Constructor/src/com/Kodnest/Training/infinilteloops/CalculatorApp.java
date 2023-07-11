package com.Kodnest.Training.infinilteloops;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
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
		case '+':calculator.addtion();
		break;
		case '-':calculator.subtraction();
		break;
		case '*':calculator.multiplication();
		break;
		case '/':calculator.division();
		break;
		case '%':calculator.findreminder();
		break;
		case '^':calculator.findsquare();
		break;
		}
		
		}
	}

}
