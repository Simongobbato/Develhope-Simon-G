/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come
 proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo
attraverso i metodi.
.*/
public class Auto {
    private int Cilindrata;
    private String Targa;
    private String Marca;
    private String Modello;
   



    public Auto(int Cilindrata, String  Targa, String Marca, String Modello) {
            this.Cilindrata = Cilindrata;
            this.Targa = Targa;
            this.Marca = Marca;
            this.Modello = Modello;
    }

    public int getCilindrata() {
        return Cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        Cilindrata = cilindrata;
    }

    public String getTarga() {
        return Targa;
    }

    public void setTarga(String targa) {
        Targa = targa;
    }

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

    @Override
    public String toString() {
        return "Auto{" +
                "Cilindrata=" + Cilindrata +
                ", Targa='" + Targa + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modello='" + Modello + '\'' +
                '}';
    }

}
