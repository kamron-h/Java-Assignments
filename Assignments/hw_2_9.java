public class hw_2_9 {

    // Write a function to swap two elements in an array, 
    // the index number of the two elements should be provided to the function.
    //----------------------------------------------------------------

    // Creation of number swapping function
    public static int[] swap_numbers (int[] numbers, int firstIndex, int secondIndex) {

        //If the length is greater than 1; swap the values
        if (numbers.length - 1 >= firstIndex && numbers.length - 1 >= secondIndex) {

            int temp = numbers[firstIndex];
            numbers[firstIndex] = numbers[secondIndex];
            numbers[secondIndex] = temp;
        }
        //Return the swapped array
        return numbers;
    }

    public static void main(String[] args) {

        int[] array_1 = {13, 23, 33};

        System.out.print("\nSwapping Index-0 with Index-1.\n\n");

        // Printing the original array
        System.out.print("Array BEFORE the Swap :\n[ ");
        for (int element : array_1) {
            
            System.out.print(" " + element);
        }
        System.out.print(" ]\n\n");

        // Printing the swapped array
        int[] sn_arr = swap_numbers(array_1, 1, 2);
        System.out.print("Array AFTER the Swap :\n[ ");
        for (int new_element : sn_arr) {
            
            System.out.print(" " + new_element);
        }
        System.out.print(" ]\n\n");

    }
}
