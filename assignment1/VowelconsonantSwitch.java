package assignment1;

public class VowelconsonantSwitch {

	public static void main(String[] args) {
		char ch = 'z';
		
		switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	System.out.println(ch + "is Vowels");
        	break;
        default:
        	System.out.println(ch + "is consonant");
		
		}

	}

}
