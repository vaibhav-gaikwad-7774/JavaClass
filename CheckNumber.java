import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		//a is positive negetive or 0
		//comand+shift+o = for importing packages
		if (a>0)
			System.out.println("Number is Positive");
			
		else
			if(a<0)
			System.out.println("Number is Negetive");
			else
				System.out.println("its Zero");

	}

}
