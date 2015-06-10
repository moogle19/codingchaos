/**
 * In der Aufgabe FizzBuzz geht es darum eine Integer Zahl entgegen zu nehmen, euer Programm soll dann bis zu dieser
 * Zahl hinaufzählen. Dabei soll bei jeder Zahl die ganzzahlig durch 3 teilbar ist anstatt der Zahl das Wort "Fizz"
 * ausgegeben werden, bei jeder Zahl die durch 5 teilbar ist das Wort "Buzz" und bei Zahlen die durch 3 und 5 teilbar
 * sind das Wort "FizzBuzz".
 */
public class FizzBuzz {

    public static void main(String[] args) {

        int a = Integer.valueOf(args[0]);

        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }
                }
                if (i % 3 != 0 && i % 5 != 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
