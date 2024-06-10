package assignment1;

import java.util.Scanner;

public class SumTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,i=1,sum = 0;
		while (i <= 10)
		{
			System.out.println("Enter a Number: ");
			n = sc.nextInt();
			sum = sum+n;//sum+=n;
			i++;
		}
		System.out.println("Sum = "+ sum);
		

	}

}
