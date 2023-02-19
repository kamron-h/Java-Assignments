public class practice_1 {
    public static void main(String[] args) {
        
        int five_digits = 12345;

        int first_digit = five_digits % 10;
        int four_digits = five_digits / 10;

        int second_digit = four_digits % 10;
        int three_digits = four_digits / 10;

        int third_digit = three_digits % 10;
        int two_digits = three_digits / 10;

        int fourth_digit = two_digits % 10;
        int one_digits = two_digits / 10;
        
        int fifth_digit = one_digits % 10;

        System.out.println(first_digit + "" + second_digit + "" + third_digit + "" + fourth_digit + "" + fifth_digit);


    }
}
