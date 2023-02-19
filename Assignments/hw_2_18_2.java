public class hw_2_18_2 {

    // Create a number guessing game:
    // The user enter any integer number between 0 to 100 from the command line argument.   
    // Your program will have 10 times of chance to guess the number 


    public static int guessingGame(int n) {

        int specialNumber = 13;
        int userGuess = n;

        if (userGuess == specialNumber) {
            // System.out.print("Yay, you guessed the special number! : " + userGuess);

            return specialNumber;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {

        int attempts = 10;

        // while (attempts < 10 && stop == false) {

            for (int i = 0; i < attempts; i++) {

                System.out.print("Please enter a number : ");
                // int guess = Integer.parseInt(args[i]);
                int guess = guessingGame(Integer.parseInt(args[i]));

                if (guess != -1) {
                    System.out.print("Yay, you guessed the special number! : " + guess);
                    break;
                }

            }
    }   
}
