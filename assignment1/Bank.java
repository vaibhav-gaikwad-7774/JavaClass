package assignment1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bal, amt, ch;
		System.out.println("Enter Curret balance: ");
		bal = sc.nextInt();
		do
		{
			System.out.println("1. Diposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Display balance");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter amount to Diposite: ");
					amt = sc.nextInt();
					bal = bal+amt;break;
			case 2: System.out.println("Enter amount to withdraw: ");
					amt = sc.nextInt();
					if (amt>bal)
						System.out.println("insufficient Balance");
					else
						bal = bal - amt;
					break;
			case 3: System.out.println("Current balance = "+ bal);break;
			case 4: System.out.println("Thank you for banking");
			default : System.out.println("invalid Choice");
			}
			
		}while (ch !=4);
		

	}

}
