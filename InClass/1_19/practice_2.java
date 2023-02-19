

public class practice_2 {
    public static void main(String[] args) {

        byte i = 0;
        short sum = 1;

        while (i < 100) {
            i++;
            sum += 1 / i;
            

            System.out.print("index = " + i + ", ");

        }
        System.out.println("\nSummation : " + sum);
    }
    
}

        // while (end != true) {
        //     if (num % 2 == 0) {

                

        //         num = num / 2;

        //     } else if (num % 2 == 1) {

        //         num = num / 2;

        //     }
        //     System.out.print(num + " ");
        // }