/*
Scrivi un programma che contiene un metodo che che confronti
due caratteri e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print(metod('a','b'));
    }
    public static boolean metod (char x, char y){ // Le parentesi sono parametri che il metodo prende in ingresso
        System.out.println( "valore x = " + x + " valore y = " + y );
        return x != y;
    }
}