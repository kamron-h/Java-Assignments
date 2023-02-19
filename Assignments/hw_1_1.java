public class hw_1_1 {

    public static void main(String[] args) {

        int first_5 = Integer.parseInt(args[0]);
        int digit_1 = first_5 % 10; // => 5
        int digit_2 = first_5 / 10;

        int b = digit_1 * 10 + digit_2;

        // System.out.print(first_4);
        System.out.print(b);
        // System.out.print(first_2);
        // System.out.print(first_1);
        // System.out.print(first_0);

    }
    
}