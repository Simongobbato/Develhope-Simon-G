/*
Definisci un metodo per la divisione di 2 numeri interi
che restituisca il quoziente che dovrà essere stampato.
 */
public class Main {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;

        int quotient = divide(dividend, divisor);

        System.out.println("Il quoziente della divisione è: " + quotient);
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Impossibile dividere per zero");
        }

        return dividend / divisor;
    }
}
/*
    int x = 3;
        int y = 4;

        int quoziente = divide(x, y);

        System.out.println("Il quoziente della divisione è: " + quoziente);
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Impossibile dividere per zero");
        }

        return x / y;
 */