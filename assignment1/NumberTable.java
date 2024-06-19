package assignment1;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		System.out.println("Enter a Number which you want a TABLE: ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println("The Table of "+ a + "Follows");
		for (int i = 1; i<=10; i++) {
			
			System.out.println((a*i));
		}
		
			
		}

	}


