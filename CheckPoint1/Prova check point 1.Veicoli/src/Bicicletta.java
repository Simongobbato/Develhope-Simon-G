public class Bicicletta extends Veicolo {
    @Override
    public double calcolaPedaggio() {
        return 0.50;
    }

    public Bicicletta(String targa, String marca, String modello, TipoVeicolo tipoVeicolo) {
        super(targa, marca, modello, tipoVeicolo);
    }

    @Override
    public String toString() {
        return "Bicicletta {" +
                "targa='" + super.getTarga() + '\'' +
                ", marca='" + super.getMarca() + '\'' +
                ", modello='" + super.getModello() + '\'' +
                ", tipoVeicolo=" + super.toString() +
                '}';
    }
}
