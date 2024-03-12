import java.text.DateFormat;

public class Prodotto extends Magazzino{
    private static final java.util.Locale ITALY = null;
    int codiceABarre;
    private Object Locale;
    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, ITALY);
    int quantita;
    Prodotto prodotto = new Prodotto();
    Prodotto prodotto1= new Prodotto();
    Prodotto prodotto2= new Prodotto();
    Prodotto prodotto3= new Prodotto();
    Prodotto prodotto4= new Prodotto();

    public Prodotto(int codiceABarre, DateFormat df, int quantita,
                    Prodotto prodotto, Prodotto prodotto1, Prodotto prodotto2,
                    Prodotto prodotto3, Prodotto prodotto4) {
        this.codiceABarre = codiceABarre;
        this.df = df;
        this.quantita = quantita;
        this.prodotto = prodotto;
        this.prodotto1 = prodotto1;
        this.prodotto2 = prodotto2;
        this.prodotto3 = prodotto3;
        this.prodotto4 = prodotto4;
    }

    public Prodotto() {
        super();

    }

    public int getCodiceABarre() {
        return codiceABarre;
    }

    public void setCodiceABarre(int codiceABarre) {
        this.codiceABarre = codiceABarre;
    }

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto1() {
        return prodotto1;
    }

    public void setProdotto1(Prodotto prodotto1) {
        this.prodotto1 = prodotto1;
    }

    public Prodotto getProdotto2() {
        return prodotto2;
    }

    public void setProdotto2(Prodotto prodotto2) {
        this.prodotto2 = prodotto2;
    }

    public Prodotto getProdotto3() {
        return prodotto3;
    }

    public void setProdotto3(Prodotto prodotto3) {
        this.prodotto3 = prodotto3;
    }

    public Prodotto getProdotto4() {
        return prodotto4;
    }

    public void setProdotto4(Prodotto prodotto4) {
        this.prodotto4 = prodotto4;
    }

    public boolean equals(Object o) {
        return true;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codiceABarre=" + codiceABarre +
                ", df=" + df +
                ", quantita=" + quantita +
                ", prodotto=" + prodotto +
                ", prodotto1=" + prodotto1 +
                ", prodotto2=" + prodotto2 +
                ", prodotto3=" + prodotto3 +
                ", prodotto4=" + prodotto4 +
                '}';
    }

    private class ITALY {
    }
}
