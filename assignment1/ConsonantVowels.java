package assignment1;

import java.util.Scanner;

public class ConsonantVowels {

    public static void main(String[] args) {
        // WAP to check Given char is vowel or consonant using switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character which you want to check: ");
        char ch = sc.next().charAt(0);  // Corrected to read a single character
        
        switch (Character.toLowerCase(ch)) {  // Handle both uppercase and lowercase vowels
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }
        
        sc.close();  // Close the Scanner
    }
}
