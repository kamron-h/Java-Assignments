import java.util.Arrays;

public class hw_2_16_1 {

    private static int partition(int[] numbers, int startIndex, int endIndex) {
        
        int midpoint = startIndex + (endIndex - startIndex) / 2;
        int pivot = numbers[midpoint];
     
        int low = startIndex;
        int high = endIndex;
     
        boolean done = false;
        while (!done) {

           while (numbers[low] < pivot) {
              low = low + 1;
           }
        
           while (pivot < numbers[high]) {
              high = high - 1;
           }
        
           if (low >= high) {
              done = true;
           }
           else {
              int temp = numbers[low];
              numbers[low] = numbers[high];
              numbers[high] = temp;
              low++;
              high--;
           }
        }
  
        return high;
     }
     
     private static void quicksort(int[] numbers, int startIndex, int endIndex) {

        if (endIndex <= startIndex) {
           return;
        }
            
        // Partition the array
        int high = partition(numbers, startIndex, endIndex);
  
        quicksort(numbers, startIndex, high);
  
        quicksort(numbers, high + 1, endIndex);
     }
  
     public static void main(String[] args) {

        int[] numbers = { 3, 76, 34, 97, 1, 14, 55, 22};
        
        // Print unsorted array
        System.out.println("UNSORTED: " + Arrays.toString(numbers));
        
        quicksort(numbers, 0, numbers.length - 1);
  
        // Print unsorted array
        System.out.println("SORTED: " + Arrays.toString(numbers));
     }
    
}
