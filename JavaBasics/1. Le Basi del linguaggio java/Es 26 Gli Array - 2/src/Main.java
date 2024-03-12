/*
Scrivi un programma che contenga un metodo che crea un array e lo
riempie con dei caratteri. Questo metodo dovrà poi stampare tutte le
occorrenze del carattere a o 0 in caso non ce ne siano.
 */
public class Main {
    public static void main(String[] args) {
        metodo();
    }
    public static void metodo(){
        char[] caratteri = {'a','b','a','c','d','e','a','a'};
        int somma = 0;
        for( int i= 0; caratteri.length > i; i++){
            if (caratteri[i] == 'a'){
                somma ++;
            }
        }
        System.out.println(somma);
    }
}