//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Articolo articolo1 = new Articolo("pizza al gorgonzola", 7.00, 0.28);
            Articolo articolo2 = new Articolo("acqua naturale", 1.00, 0.04);
            Articolo[] aricoli = new Articolo[]{articolo1, articolo2};

            Carrello carrello = new Carrello();
        System.out.println("Carrello: " );
        System.out.println("numero di articoli: " + carrello.getArticoli().length);
        System.out.println("prezzo finale(senza IVA): " +carrello.getPrezzoFinale(false));
        System.out.println("prezzo finale(con IVA): " +carrello.getPrezzoFinale(true));

        CarrelloSenzaIVA carrelloSenzaIVA = new CarrelloSenzaIVA(aricoli);
        System.out.println("carrello senza IVA: ");
        System.out.println("numero di articoli: " +carrelloSenzaIVA.getArticoli().length);
        System.out.println("prezzo finale(con IVA): " +carrello.getPrezzoFinale(true));
        System.out.println("prezzo finale(senza IVA): " +carrello.getPrezzoFinale(false));

        CarrelloConIVA carrelloConIVA = new CarrelloConIVA(aricoli);
        System.out.println("carrello senza IVA: ");
        System.out.println("numero di articoli: " +carrelloSenzaIVA.getArticoli().length);
        System.out.println("prezzo finale(con IVA): " +carrello.getPrezzoFinale(true));
        System.out.println("prezzo finale(senza IVA): " +carrello.getPrezzoFinale(false));
    }
}