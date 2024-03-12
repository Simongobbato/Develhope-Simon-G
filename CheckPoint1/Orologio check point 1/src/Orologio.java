public class Orologio {
    public String Marca;
    public String Modello;
    public String Tipo;
    public double prezzo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public Orologio(String marca, String modello, String tipo, double prezzo) {
        Marca = marca;
        Modello = modello;
        Tipo = tipo;
        this.prezzo = prezzo;
    }

}
