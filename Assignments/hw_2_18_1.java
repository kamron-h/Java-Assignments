import java.util.Random;

public class hw_2_18_1 {

    // Write a program to generate 10 random numbers between [0, 50], and save them in an 
    // array. Then find if there are two elements a and b can make a + b = 50, if yes, display the 
    // values of a and b

    public static void main(String[] args) {

        Random rand = new Random();

        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Write code to generate 10 random numbers below
        System.out.print(" " + array.length);

        for (int i = 0; i < array.length -1; i++) {
            // Generate random number && append to array
            array[i] = rand.nextInt(50);

            System.out.print(" " + array[i]);

        }

     
        System.out.println("\n\n");

        // Check for addition requirement
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length; i++) {
                if (array[j] + array[i] == 50) {
                    System.out.println(array[i] + " + " + array[j] + " = " + "50\n\n");
                }
            }
        }
    }
}
