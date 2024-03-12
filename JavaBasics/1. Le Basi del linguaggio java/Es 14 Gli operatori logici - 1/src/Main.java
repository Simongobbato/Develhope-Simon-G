/*
Scrivi un programma che contiene un metodo che dati 2 interi in ingresso
 ed un valore di confronto verifichi se il numero di confronto è compreso
  tra due valori specifici e stampi il risultato dell'operazione
 comprensivo dei due limiti (inferiore e superiore)
 */
public class Main {
    public static void main(String[] args) {
        int limiteInferiore = 1;
        int limiteSuperiore = 3;
        int numeroDiConfronto = 2;

        verificaComprensione(numeroDiConfronto, limiteInferiore, limiteSuperiore);
    }

    public static void verificaComprensione(int numeroDiConfronto, int limiteInferiore, int limiteSuperiore) {
        System.out.println("Numero di confronto: " + numeroDiConfronto);
        System.out.println("Limite inferiore: " + limiteInferiore);
        System.out.println("Limite superiore: " + limiteSuperiore);

        if (numeroDiConfronto >= limiteInferiore && numeroDiConfronto <= limiteSuperiore) {
            System.out.println("Il numero è compreso tra i due limiti.");
        } else {
            System.out.println("Il numero non è compreso tra i due limiti.");
        }
    }
}