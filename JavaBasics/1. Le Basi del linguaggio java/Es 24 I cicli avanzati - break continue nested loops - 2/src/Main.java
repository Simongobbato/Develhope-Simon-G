/*
Scrivi un programma che contenga un metodo che prende in ingresso un
valore numerico e stampa tutti i numeri fino al valore immesso,
la stampa dovrà saltare il valore uguale a 5.
 */
public class Main {
    public static void main(String[] args) {
        int i=1;
        for(i=1; i < 20; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}