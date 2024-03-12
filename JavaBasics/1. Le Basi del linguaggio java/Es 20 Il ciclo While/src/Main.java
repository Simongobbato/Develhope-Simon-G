/*
Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore e calcoli la somma
 di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
 */
public class Main {
    public static void main(String[] args) {
        int limite = 4;
        sommaWhile (limite);
    }
    public static void sommaWhile(int nino){
        int i = 1;
        int somma = 0;
        while (i < nino){
            somma += i;
            i++;
        }
        System.out.println(somma);
    }
}