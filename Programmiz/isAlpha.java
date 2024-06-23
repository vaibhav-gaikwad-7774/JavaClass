package Programmiz;

import java.util.Scanner;

public class isAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a character which you want to check");
		char ch = sc.next().charAt(0);
		if (Character.isAlphabetic(ch))
			System.out.println(ch + "its a alphabet");
		else
			System.out.println(ch + "its not a alphabet");
			
		

	}

}
