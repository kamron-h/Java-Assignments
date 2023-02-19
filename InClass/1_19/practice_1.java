class practice_1 {

    public static void main(String[] args) {
        
        int thousand = Integer.parseInt(args[0]);

        if (thousand > 999) {
            System.out.println(thousand);
            System.out.println("Thousand");
        } else {
            System.out.println(thousand);
            System.out.println("Not a Thousand");
        }

    }

}