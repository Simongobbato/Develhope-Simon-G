/*
Scrivere un programma che contenga una classe che definisce uno Studente
che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters)
ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */
public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Simo", "G",123456789);
        System.out.println("Studente : " + studente);
    }
}