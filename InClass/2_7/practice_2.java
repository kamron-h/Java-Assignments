
public class practice_2 {

    public static int BinarySearch(int[] numbers, int numbersSize, int key) {
        int mid = 0;
        int low = 0;
        int high = numbersSize - 1;
        
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
        

         int num_1 = Integer.parseInt(args[0]);
         int num_2 = Integer.parseInt(args[1]);
         int num_3 = Integer.parseInt(args[2]);

        int[] numbers = { num_1, num_2, num_3 };

        

        int NUM_SIZE = numbers.length;
      //   int i = 0;
        int key = 0;
        int keyIndex = 0;

        for (int i = 0; i < NUM_SIZE; i++) {

            if (numbers[i] >=  key) {
               key = numbers[i];
            }
        }

        System.out.println();
        System.out.print("Largest Number: " + key);
        System.out.println();
        System.out.println();

        
   
        System.out.print("NUMBERS: ");
        for (int ii = 0; ii < NUM_SIZE; ++ii) {
            System.out.print(numbers[ii] + " ");
        }
        System.out.println();
        System.out.println();
        
        keyIndex = BinarySearch(numbers, NUM_SIZE, key);
        
        if (keyIndex == -1) {
            System.out.print(key + " was not found.");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.print("Found " + key + " at index " + keyIndex + " ");
            System.out.println();
        }

     }


    
}
