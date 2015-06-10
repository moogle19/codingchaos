public class aufgabe01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if(num % 3 == 0)
            System.out.print("Fizz");

        if(num % 5 == 0)
            System.out.println("Buzz");

        System.out.println("\n");
    }
}
