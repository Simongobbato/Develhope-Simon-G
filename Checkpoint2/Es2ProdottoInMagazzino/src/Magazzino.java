import java.awt.*;

public class Magazzino {
    private List inventario;

    // Metodi per gestire l'inventario e le vendite
    public void registraVendita(Prodotto prodotto, int quantita, Point Prodotto) {
        // Verifica se il prodotto è disponibile in magazzino
        if (inventario.contains(Prodotto)) {
            Prodotto prodotto1 = prodotto;
            Point prodotto2 = Prodotto;
            int prodottoInMagazzino = inventario.getX();
            // Verifica se c'è abbastanza quantità disponibile
            if (prodottoInMagazzino >= quantita) {
                // Aggiorna la quantità disponibile
                    prodottoInMagazzino.setQuantita
                        (prodottoInMagazzino -
                                quantita);
                System.out.println("Vendita registrata con successo.");
            } else {
                System.out.println("Quantità insufficiente in magazzino.");
            }
        } else {
            System.out.println("Prodotto non disponibile in magazzino.");
        }
    }
}
