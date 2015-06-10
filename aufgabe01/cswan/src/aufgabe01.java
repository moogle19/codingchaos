public class aufgabe01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        for(int i = 1; i <= num; i++) {
            System.out.print(i + ": ");

            if(i % 3 == 0)
                System.out.println("Fizz");

            if(i % 5 == 0)
                System.out.println("Buzz");

            System.out.println();
        }
    }
}
