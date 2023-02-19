

public class hw_2_18_3 {

    // Write a program, read an integer from the command line argument, and then check if 
    // the number is a palindrome (121 is a palindrome, 123 is not a palindrome)

    public static void isPalindrome(String n) {

        String originalStr = n;
        String reversedStr = "";

        for (int i = 0; i < n.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        int original = Integer.parseInt(n);
        int reversed = Integer.parseInt(reversedStr);
        
        if (original == reversed) {
            System.out.println("\n" + n + " is a Palindrome!\n");
        } else {
            System.out.println("\n" + n + " isn't a Palindrome, try again...\n");
        }
    }

    public static void main(String[] args) {

        String number = args[0];

        isPalindrome(number);   
    }
}
