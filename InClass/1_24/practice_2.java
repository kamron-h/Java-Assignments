public class practice_2 {
    public static void main(String[] args) {
        
        double sum = 0;

        System.out.print("\nIndexLooped : [");

        for (int i = 1; i <= 100; i++ ) {


            if (i % 2 == 0) {
                sum += (-i);
            } else {
                sum += i;
            }

            System.out.print(i + " " + "");
        }

            System.out.print("]\n\n");
            System.out.println("Summation : " + sum);

    }
    
}
