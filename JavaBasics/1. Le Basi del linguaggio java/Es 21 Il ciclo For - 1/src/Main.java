/*
Scrivi un programma che contenga un metodo che prende in ingresso
 un valore numerico e restituisca la tabellina aritmetica di quel numero
 che dovrà essere stampata a video.
*/
public class Main {
    public static void main(String[] args) {
        int numero = 2;
        stampaTabellina(numero);
    }

    public static void stampaTabellina(int numero) {
        System.out.println("Tabellina aritmetica del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int risultato = numero * i;
            System.out.println(numero + " * " + i + " = " + risultato);
        }
    }
}