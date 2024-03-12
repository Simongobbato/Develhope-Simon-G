/*
Scrivi un programma che contenga un metodo che prende in ingresso
 un numero e il massimo numero di risultati che vuoi avere e stampi
  tutti i numeri naturali in ordine inverso (quindi se passo il punto
 di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
 */
public class Main {
    public static void main(String[] args) {
        int numeroDiPartenza = 9;
        int numeroRisultati = 4;
        stampaNumeriInversi (numeroDiPartenza, numeroRisultati);
    }
    public static void stampaNumeriInversi(int numeroDiPartenza, int numeroRisultati) {
        System.out.println("numeri naturali in ordine inverso: ");
        for(int i = 0; i < numeroRisultati; i++){
            System.out.println((numeroDiPartenza - i) + " " );
        }
    }
}