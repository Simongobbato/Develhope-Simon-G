/*
Scrivi un programma che contiene un metodo che che confronti
 due numeri interi e determini se sono diversi.
Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(metod(1,2));
    }
    public static boolean metod(int x, int y){
        System.out.println("valore di x = " + x +  " valore di y = " + y);
        return x != y;
    }
}