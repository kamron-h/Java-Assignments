
public class practice_1 {
    public static void main(String[] args) {
        
        int[] arr = {3,1,34,13,35,74,99,56,98,73};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > max) { //if greater than max
                max = arr[i];
            } else if (arr[i] < min) { //if less than max
                min = arr[i];
            }
        }
        System.out.print("\nArray : ");
        System.out.print("[ ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("]");

        System.out.println("\nMax : " + max);
        System.out.println("\nMin : " + min + "\n");
    }
}