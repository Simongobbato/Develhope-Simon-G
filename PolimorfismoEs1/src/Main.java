/*
Scrivere un programma che contenga una classe chiamata Forma
 ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
 per calcolare l'area del rettangolo.

 A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
  aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area
  per quest'ultima figura
 */
public class Main{
    public static void main(String[]args){
        Forma forma = new Forma();
        System.out.println("Forma:" + forma);
        // Creazione di un oggetto rettangolo
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);

        // Calcolo e stampa dell'area del rettangolo
        rettangolo.calcolaArea(5.00,3.00);
        //Creazione di un oggetto triangoolo
        Triangolo triangolo = new Triangolo(3.00,5.00);
        //Calcolo e stampa dell'area del triangolo
        triangolo.calcolaArea(3.00,5.00/2);
    }
}