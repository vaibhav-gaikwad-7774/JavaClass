package Programmiz;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Integer: ");
		int num  = sc.nextInt();
		int count = 0;
		while (num !=0) {
			num/=10;
			++count;
		}
		System.out.println("Number of digit: "+ count);

	}

}
