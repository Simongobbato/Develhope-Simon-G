public abstract class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private TipoVeicolo tipoVeicolo;

    public abstract double calcolaPedaggio();

    public Veicolo(String targa, String marca, String modello, TipoVeicolo tipoVeicolo) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }

    public Veicolo() {
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", tipoVeicolo=" + tipoVeicolo +
                '}';
    }
}
