package Programmiz;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner  (System.in);
		System.out.println("Enter a string: ");
		int num = sc.nextInt();
		int reverse = 0;
		
		System.out.println("Original number: "+ num);
		
		while (num !=0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			
			num /= 10;
		}
		
		System.out.println("Reversed Number: "+ reverse);

	}

}
