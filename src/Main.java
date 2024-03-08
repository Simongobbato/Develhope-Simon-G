/*
Scrivere un programma che contenga una classe chiamata Forma
 ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
 per calcolare l'area del rettangolo.
 */
public class Main {
    public static void main(String[]args){
        Forma forma = new Forma();
        System.out.println("Forma:" + forma);
        // Creazione di un oggetto rettangolo
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);

        // Calcolo e stampa dell'area del rettangolo
        rettangolo.calcolaArea(5.00,3.00);
    }

}