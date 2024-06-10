import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roll number");
		int rollNum = sc.nextInt();
		System.out.println("Enter a Name");
		String name = sc.next();
		System.out.println("Enter marks in three sub: ");
		double mark1 = sc.nextDouble();
		double mark2 = sc.nextDouble();
		double mark3 = sc.nextDouble();
		double total = mark1 + mark2 + mark3;
		double totalAvg = total/3;
		System.out.println("The roll no is : "+ rollNum);
		System.out.println("The nme is : "+ name);
		System.out.println("the Average of your marks will be: "+totalAvg);
		
		

	}

}
