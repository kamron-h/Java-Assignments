public class hello {
    public static void main(String[] args) {
        int height;
        int width;

        height = Integer.parseInt(args[0]);
        width = Integer.parseInt(args[1]);

        System.out.println("Hello " + "," + " welcome");
        System.out.println("Variables (a + b) = " + (height + width));
    }
}