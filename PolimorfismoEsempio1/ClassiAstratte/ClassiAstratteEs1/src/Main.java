/*Scrivere un programma che contenga una classe astratta chiamata Forma ed un
metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano
 il metodo per il calcolo dell'area in maniera specifica.*/

public class Main {
    public static void main(String[]args){
        // Creazione di un oggetto rettangolo
        Rettangolo1 rettangolo = new Rettangolo1(5.0, 3.0);

        // Calcolo e stampa dell'area del rettangolo
            //Creazione di un oggetto triangoolo
            Triangolo1 triangolo = new Triangolo1(3.00, 5.00);
            //Calcolo e stampa dell'area del triangolo
            triangolo.calcolaArea(3.00, 5.00 / 2);
    }
}