/*
Scrivi un programma che contenga un metodo che prende in ingresso
un valore numerico e restituisca il nome del giorno
della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
 */
public class Main {
    public static void main(String[] args) {
        int day=10;
        System.out.println(chooseTheDay(day));
    }
    public static String chooseTheDay (int settimana){
        String caso;
        switch (settimana) {
            case 1:
                caso = "lunedì";
                break;
            case 2:
                caso = "martedì";
                break;
            case 3:
                caso = "mercoledì";
                break;
            case 4:
                caso = "giovedì";
                break;
            case 5:
                caso = "venerdì";
                break;
            case 6:
                caso = "sabato";
                break;
            case 7:
                caso = "domenica";
                break;
            default:
                caso = "nullo";
                break;
        }
        return caso;
    }
}