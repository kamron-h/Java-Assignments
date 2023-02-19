// 1/31 In-class practice:

// Complete the program with the following parts:

// 1. create an int array of size 10, initialize the elements with random numbers in the range of [0, 100)

// 2. find the largest element

// 3. sorting the array in a ascending order

// 4. sort the array in a descending order


public class practice_1 {
    public static void main(String[] args) {
        int[] arr = {3,1,34,13,35,74,99,56,98,73};
        
        //Linear Search
        int farLeftIndex = arr[0];
        
        System.out.println("Before Selection Sort");

        
        System.out.print("[ ");
        for (int display = 0; display < arr.length; display++) {
            System.out.print(arr[display]+" ");
        }
        System.out.println("]");
        System.out.println();



        for (int i = 0; i < arr.length - 1; ++i) {

            // Find index of smallest remaining element
            int indexSmallest = i;
            for (int j = i + 1; j < arr.length; ++j) {
         
               if (arr[j] < arr[indexSmallest]) {
                  indexSmallest = j;
               }
            }
         
            // Swap numbers[i] and numbers[indexSmallest]
            int temp = arr[i];
            arr[i] = arr[indexSmallest];
            arr[indexSmallest] = temp;
         }

                System.out.println();


                System.out.println("After Selection Sort");
                System.out.print("[ ");
                for (int display = 0; display < arr.length; display++) {
                    System.out.print(arr[display]+" ");
                }
                System.out.println("]");
                System.out.println();


                // BINARY SEARCH

                int target = 35;
                int left = 0;
                int right = arr.length - 1;
                int mid = (left + right)/2;

                while (left <= right) {

                    if (mid == target) {
                        System.out.println("Found Target " + target);
                        break;
                    }
                    else if (arr[mid] < target) {
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                    }
                    
                }


                
            }
            
}

//Binary Search [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ; Search for 75.

// System.out.println("]");
// System.out.println();
// System.out.println();
// System.out.println();
// System.out.println(newList);