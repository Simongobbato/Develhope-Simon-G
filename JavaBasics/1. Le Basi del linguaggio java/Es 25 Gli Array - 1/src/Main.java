/*
Scrivi un programma che contenga un metodo che crea un array e lo
riempie con i numeri da 1 a 10 e che che calcoli la somma dei numeri
 contenuti nell'array inizializzato e la stampi a video.
 */
public class Main {
    public static void main(String[] args) {
        creaUnArray();
    }
    public static void creaUnArray(){
        int[] numeri= new int[11];
        int somma = 0;
        for (int i = 1; numeri.length > i; i++){
            numeri[i] = i;
            System.out.println(numeri[i]);
            somma += i;
        }
        System.out.println("somma " +somma);
    }
}