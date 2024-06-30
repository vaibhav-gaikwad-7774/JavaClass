package StriverDSA;

public class Main {
    public static void main(String[] args) {
        String test = "I am striv3r.";
        char ch = test.charAt(5); // accessing the character 's'
        StringBuilder sb = new StringBuilder(test);
        sb.setCharAt(10, 'e'); // Correcting a misspelling
        test = sb.toString();
        System.out.println(test);
        System.out.println("ch = " + ch);
    }
}