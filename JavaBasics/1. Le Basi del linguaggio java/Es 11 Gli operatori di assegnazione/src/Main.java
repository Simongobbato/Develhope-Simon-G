/*
Scrivi un programma che contiene un metodo che date due variabili
le incrementi di un valore scelto da te e le moltiplichi fra di loro.
Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(metod(1,2));
    }
    public static double metod (double x, double y){
        x ++;
        y +=5;
        double z = x * y;
        return z;
    }
}