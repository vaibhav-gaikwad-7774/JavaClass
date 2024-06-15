package assignment1;

public class SwapNumbers {

	public static void main(String[] args) {
		float first = 1.20f,  second = 2.34f;
		
		System.out.println("before swap");
		System.out.println("First Number = "+ first);
		System.out.println("Secid Number = "+ second);
		
		float temp = first;
		
		first = second;
		
		second = temp;
		
		System.out.println("sfter swap");
		System.out.println("First Number = "+ first);
		System.out.println("Secid Number = "+ second);
		

	}

}
