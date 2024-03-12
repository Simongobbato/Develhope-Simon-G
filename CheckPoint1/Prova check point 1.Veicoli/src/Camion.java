public class Camion extends Veicolo{
    @Override
    public double calcolaPedaggio() {
        return 6;
    }

    public Camion(String targa, String marca, String modello, TipoVeicolo tipoVeicolo) {
        super(targa, marca, modello, tipoVeicolo);
    }
}
