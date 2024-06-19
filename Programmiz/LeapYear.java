package Programmiz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Year: ");
		int year=sc.nextInt();
		
		while (true) {
            System.out.println("Enter a 4-digit Year: ");
            year = sc.nextInt();

            if (year >= 1000 && year <= 9999) {
                break;
            } else {
                System.out.println("Invalid year. Please enter a 4-digit year.");
            }
        }
		
	
		
		if (year%400==0)
			System.out.println(year + " Its a leap");
		else if(year%100==0)
			System.out.println(year + " Its a leap");
		else if(year%4 == 0)
			System.out.println(year + " Its a leap");
		else
			System.out.println(year+ " Its not a leap");
			

	}

}
