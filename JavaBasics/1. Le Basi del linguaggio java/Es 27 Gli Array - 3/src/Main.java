/*
Scrivere un programma che contenga un metodo che permetta di rimuovere
gli elementi duplicati in un array di interi. L'array ottenuto dovrà essere stampato a video.
 */
public class Main {
    public static void main(String[] args) {
        int[] arrayConDuplicati = {1, 2, 3, 4, 2, 5, 6, 2, 7, 8, 8, 9};
        System.out.println("Array originale: " + java.util.Arrays.toString(arrayConDuplicati));
        int[] arraySenzaDuplicati = rimuoviDuplicati(arrayConDuplicati);
        System.out.println("Array senza duplicati: " + java.util.Arrays.toString(arraySenzaDuplicati));
    }
    public static int[] rimuoviDuplicati(int[] array) {
        java.util.Arrays.sort(array);
        int elementiUnici = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                elementiUnici++;
            }
        }
        int[] arraySenzaDuplicati = new int[elementiUnici + 1];
        arraySenzaDuplicati[0] = array[0];
        int j = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                arraySenzaDuplicati[j] = array[i];
                j++;
            }
        }
        return arraySenzaDuplicati;
    }
}