public class Moto extends Veicolo {
    @Override
    public double calcolaPedaggio() {
        return 3;
    }

    public Moto(String targa, String marca, String modello, TipoVeicolo tipoVeicolo) {
        super(targa, marca, modello, tipoVeicolo);
    }
}
