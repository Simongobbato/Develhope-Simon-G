/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore
numerico e stampa tutti i numeri fino al valore immesso, la stampa dovrà
interrompersi se il valore è uguale a 5.
 */
public class Main {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}