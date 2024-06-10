package assignment1;

public class SumofEvenAndOdd {

	public static void main(String[] args) {
		//sum of even and sum of odd number from 1 to 100
		//int sumEven = 0  sumOdd = 0;

		int sumEven = 0;
		int sumOdd = 0;
		int i = 1;
		
		while (i<=100) {
			if(i%2 == 0) {
				sumEven=(sumEven+i);
			} else {
				sumOdd =(sumOdd +i);
			}
			i++;
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
