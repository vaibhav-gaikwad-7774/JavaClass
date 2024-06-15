package assignment1;

import java.util.Scanner;

public class LargestThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a>=b && a>=c)
			System.out.println("The number A which is "+ a + "is Greater");
		else if
			(b>=a && b>= c)
			System.out.println("The number B which is "+ b + "is Greater");
		else
			System.out.println("The number C which is "+ c + "is Greater");

	}

}
