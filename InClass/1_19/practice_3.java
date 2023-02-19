public class practice_3 {
    public static void main(String[] args) {
        float random_num = Integer.parseInt(args[0]);

        float summation = 0f;

        while (random_num != 0) {
            // if even...
            if (random_num % 2 == 0) {
                summation += (random_num / 2);
                System.out.println("Random Number Index : " + random_num);
                random_num--;

            }
            // if odd...
            else if (random_num % 2 == 1) {
                summation += ((3 * random_num) + 1);
                System.out.println("Random Number Index : " + random_num);
                random_num--;
            }
            System.out.println("Summation : " + summation);
        }
    }
}
