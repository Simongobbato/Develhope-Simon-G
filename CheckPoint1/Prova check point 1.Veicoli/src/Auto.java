public class Auto extends Veicolo {
    @Override
    public double calcolaPedaggio() {
        return 5;
    }

    public Auto(String targa, String marca, String modello, TipoVeicolo tipoVeicolo) {
        super(targa, marca, modello, tipoVeicolo);
    }
}
