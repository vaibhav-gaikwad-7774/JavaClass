package assignment1;

import java.util.Scanner;

public class Caculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		System.out.println("Enter a two Numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter a Choice which you want: ");
		int ch = sc.nextInt();
		switch (ch)
		{
		case 1 : res = n1+n2;break;
		case 2 : res = n1-n2;break;
		case 3 : res = n1*n2;break;
		case 4 : res = n1/n2;break;
		default: System.out.println("Invalid Choice");System.exit(1);
		}
		System.out.println("Result = "+ res);
		
		
		

	}

}
