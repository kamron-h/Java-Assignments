public class hw_2_16_2 {

    public static void fibSequence(int n) {

        int n1 = 0;  
        int n2 = 1;
        int n3;

        System.out.print("\nFibonacci Sequence : \n\nf(n), n = " + n);

        System.out.print("\n\n [ ");

        System.out.print(n1 + " " + n2);  
            
        for(int i = 2; i < n ; ++i) {    
            n3 = n1 + n2;    
            System.out.print(" " + n3);    
            n1 = n2;    
            n2 = n3;    
        }
        System.out.println(" ]\n");
    }

    public static void main(String args[]) {

        int count = Integer.parseInt(args[0]);

        fibSequence(count);
    }
}
