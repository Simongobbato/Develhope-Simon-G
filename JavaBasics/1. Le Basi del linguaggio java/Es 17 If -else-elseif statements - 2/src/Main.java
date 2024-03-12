/*
Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
"Lunghezza minore di 10" o "Lunghezza pari a 10".
 */
public class Main {
    public static void main(String[] args) {
        String pollicino = "123456789";
        if(pollicino.length()>10) {
            System.out.println("lunghezza > 10");
        }
        else if (pollicino.length()<10) {
            System.out.println("lunghezza < 10");
        }
        else if(pollicino.length()==10) {
            System.out.println("lungheza = 10");
        }
    }
}