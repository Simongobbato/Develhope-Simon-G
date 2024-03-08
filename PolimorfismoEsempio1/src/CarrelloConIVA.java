import java.util.Arrays;

public class CarrelloConIVA extends Carrello{
    public CarrelloConIVA(Articolo[]articoli) {
        super();
        this.setArticoli(articoli);
    }
    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                ", prezzo=" + getPrezzoFinale(true) +
                '}';
    }
}

