package com.Kodnest.Training.infinilteloops;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println(age>=18?"You are eligible for Voting":"No Voting");
	}

}
