package assignment1;

import java.util.Scanner;

public class BiggestThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a>c)
				System.out.println(a+ "Number is Great ");
		else if (b>a && b>c)
			System.out.println(b+" Number is Great");
		else
			System.out.println(c+"Number is Great ");

	}

}
