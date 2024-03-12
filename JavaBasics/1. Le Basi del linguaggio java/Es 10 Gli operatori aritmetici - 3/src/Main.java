/*Definisci un metodo che calcoli la media tra 3 numeri
 e restituisca il risultato che dovrà essere stampato.
*/
public class Main {

    public static void main(String[] args) {
        System.out.println(media(2,4,8));
    }
    public static double media (int x, int y, int z){
        double media = ((double) x + (double) y + (double) z)/3;
        return media;
    }
}