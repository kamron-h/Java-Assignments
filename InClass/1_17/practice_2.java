

public class practice_2 {

    public static void main(String[] args) {
        
        int change = Integer.parseInt(args[0]);

        int quarters = change / 25;
        int q_remainder = change % quarters;

        int dimes = q_remainder / 10;
        int d_remainder = q_remainder % 10;
        

        int nickles = d_remainder / 5;
        int n_remainder = d_remainder % 5;

        int pennies = n_remainder / 1;

        // double a_power = Math.pow(dimes, nickles);

        //2d coordinates problem
        // sqr((x1 - x2)pwr(2) + (y1 - y2)pwr(2)) = slope distance
        // double x1 = Double.parseDouble(args[1];
        // .....
        // .....
        // .....
        // double distance = Math.sqrt((x1 - x2)pwr(2) + (y1 -y2)pwr(2))

        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies: " + pennies);
    }
    
}
