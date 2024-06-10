package assignment1;

import java.util.Scanner;

public class AgeMinorMajor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		if(age>=18)
			System.out.println("you are major");
			if(age<=17)
				System.out.println("You are minor");
			else
				System.out.println("The Age you Entered is Invalid");
			

	}

}
