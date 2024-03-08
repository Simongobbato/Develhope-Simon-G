import java.util.Arrays;

public abstract class Carrello {
    private Articolo[] articoli;

    public Carrello(){
        setArticoli(articoli);
    }


    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }
    public double getPrezzoFinale (boolean conIVA){
        double prezzoFinale = 0.0;
        for (Articolo articolo: articoli){
            prezzoFinale += articolo.getPrezzo(conIVA);
        }
        return prezzoFinale;

    }


    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
