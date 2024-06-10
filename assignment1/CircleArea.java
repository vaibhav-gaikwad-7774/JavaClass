package assignment1;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Radius of Circle which you want: ");
		double pie = 3.14;
		double r = sc.nextInt();
		double area = (pie * (r*r));
		System.out.println("The area of Circle is "+ area);
		
		

	}

}
