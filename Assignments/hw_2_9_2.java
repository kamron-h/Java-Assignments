public class hw_2_9_2 {

    // Write a function for binary search in recursive algorithm...
    //----------------------------------------------------------------

    public static int BinarySearch(int[] numbers, int numSize, int key) {
        int mid = 0;
        int low = 0;
        int high = numSize - 1;
        
        while (high >= low) {
           mid = (high + low) / 2;
           if (numbers[mid] < key) {
              low = mid + 1;
           }
           else if (numbers[mid] > key) {
              high = mid - 1;
           }
           else {
              return mid;
           }
        }

        return -1; // not found
        
     }



    public static void main(String[] args) {

        int[] array_1 = {13, 23, 33};

        // Print the array
        System.out.print("\nArray:\n\n[ ");
        for (int element : array_1) {
            
            System.out.print(" " + element);
        }
        System.out.print(" ]\n");


        // Get user-input from command line
        int key = Integer.parseInt(args[0]);

        // Use BinarySearch
        int keyIndex = BinarySearch(array_1, array_1.length, key);
        
        if (keyIndex == -1) {
            System.out.print(key + " was not found.\n");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.print("Found " + key + " at index " + keyIndex + "\n");
            System.out.println();
        }

    }
}
