public class Articolo extends Carrello{
    private final String nome;
    private  final  double prezzo;
    private final double IVA;

    public Articolo(String nome, double prezzo, double IVA) {
        super();
        this.nome = nome;
        this.prezzo = prezzo;
        this.IVA = IVA;
    }

    public double getPrezzo(boolean conIVA) {
        if(conIVA) {
            return prezzo + prezzo * IVA;
        } else  {
            return prezzo;
        }
    }

    @Override
    public String toString() {
        return "Ariticolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", IVA=" + IVA +
                '}';
    }
}
