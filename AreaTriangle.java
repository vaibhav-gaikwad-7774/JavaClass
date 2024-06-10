import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rectangle lenght values which you want to: ");
		int length = sc.nextInt();
		System.out.println("Enter a rectangle lenght values which you want to: ");
		int breadth = sc.nextInt();
		int area = length*breadth;
		System.out.println("The value of area of rectangle is : "+ area);
		
		
	}

}
