/*
Scrivere un programma che contenga un metodo che permette
di inizializzare una matrice riempita con dei valori a vostro
piacimento e restituisca la somma degli elementi sulla prima riga
 */
public class Main {
    public static void main(String[] args) {
        int[][] numeri = new int[][]{
                {1, 2, 3, 4},
                { 5, 6, 7, 8, 9}
        };
        int counter =0;
        for(int i = 0; i < numeri[0].length; i++) {
            counter += numeri[0][i];
        }
        System.out.println(counter);
    }
}