package StriverDSA;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a day between 1 - 7");
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tues");
			break;
		case 3:
			System.out.println("wednes");
			break;
		case 4:
			System.out.println("thurs");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		
		}
		sc.close();
	}

}
