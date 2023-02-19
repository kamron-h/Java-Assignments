public class practice_1 {
    public static void main(String[] args) {
        
        double sum = 0;

        System.out.print("\nIndexLooped : [");

        for (int i = 1; i <= 99; i+=2) {

            sum += (1 / (double)i);
            System.out.print(i + " " + "");
        }

            System.out.print("]\n\n");
            System.out.println("Summation : " + sum);

    }
    
}
