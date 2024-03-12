/*
Definisci un metodo per la divisione di 3 numeri interi
che restituisca il risultato che dovrà essere stampato
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(divisione(1,2,4));
    }
    public static double divisione (int x, int y, int z){
        double risultatoDivisione = (double)x/(double)y/(double)z;
        return risultatoDivisione;
    }
}