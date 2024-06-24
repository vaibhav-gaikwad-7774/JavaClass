package StriverDSA;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int marks = sc.nextInt();
		
		if (marks<=25)
			System.out.println("Grade E");
		else if (marks >= 25 && marks <=49)
			System.out.println("Grade D");
		else if (marks >= 50 && marks <=59)
			System.out.println("Grade C");
		else if (marks >= 60 && marks <=69)
			System.out.println("Grade B");
		else if (marks>=70)
			System.out.println("Grade A");
		else
			System.out.println("Invalid range");
		

	}

}
