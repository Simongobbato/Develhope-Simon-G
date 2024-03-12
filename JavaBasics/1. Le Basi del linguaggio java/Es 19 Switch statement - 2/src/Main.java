/*
Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
 */
public class Main {
    public static void main(String[] args) {
        char carattere = '-';
        System.out.println(pir(carattere));

    }
    public static String pir (char carattere) {
        String variabile;
        switch (carattere) {
            case '+':
                variabile = "+";
                break;
            case '-':
                variabile = "-";
                break;
            case '/':
                variabile = "/";
                break;
            case '*':
                variabile = "*";
                break;
            default:
                variabile = "iseriscia uno dei caratteri operatori";
                break;
        }
        return variabile;
    }
}