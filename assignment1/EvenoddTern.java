package assignment1;

import java.util.Scanner;

public class EvenoddTern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		String evenOdd = (num %2 == 0)? "Even" : "Odd";
		
		System.out.println(num+ " is "+ evenOdd);
		

	}

}
