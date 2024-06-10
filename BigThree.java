import java.util.Scanner;

public class BigThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1>n2 && n1>n3)
			System.out.println("Big value is "+ n1);
		else
			if(n2>n3)
				System.out.println("Big value is "+ n2);
			else
				System.out.println("Big value is "+ n3);

	}

}
