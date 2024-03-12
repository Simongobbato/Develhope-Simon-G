/*
Scrivi un programma che contiene un metodo che prenda un numero in ingresso
e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.
 */
public class Main {
    public static void main(String[] args) {
        int numeroDaVerificare = 5;

        boolean isPari = (numeroDaVerificare % 2 == 0) && true;

        System.out.println("Il numero " + numeroDaVerificare + " è " + (isPari ? "pari" : "dispari"));
    }
}