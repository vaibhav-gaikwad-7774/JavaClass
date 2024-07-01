package Programmiz;

public class Armstrong {

	public static void main(String[] args) {
		int num = 371, originalnum, remainder, result = 0;
		
		originalnum = num;
		
		while (originalnum != 0)
		{
			remainder = originalnum % 10;
			result +=Math.pow(remainder, 3);
			originalnum /=10;
			
		}
		if (result == num)
			System.out.println(num + " its an armstrong number");
		else
			System.out.println(num + "its not an armstrong num");

	}

}
