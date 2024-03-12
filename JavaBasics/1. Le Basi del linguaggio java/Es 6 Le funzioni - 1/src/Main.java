/*Definire una funzione che accetti in ingresso 2 interi e ne restituisca la somma.
 */
public class Main {
    public static void main(String[] args) {
        int x = 50;
        int y = 80;
        int z = x + y;
        System.out.print("Sum of x, y : " + z);
    }
    public static int somma (int x, int y) {
        int z= (int) x + (int) y;
        return z;
    }
}