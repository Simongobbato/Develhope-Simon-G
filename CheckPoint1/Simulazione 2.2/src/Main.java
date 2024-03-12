abstract class Dipendente {
    private int persona;
    private double costoAziendale;
    public Dipendente(int persona, double costoAziendale) {
        this.persona = persona;
        this.costoAziendale = costoAziendale;
    }
    public int getPersona() {
        return persona;
    }
    public void setMatricola(int persona) {
        this.persona = persona;
    }
    public double getCostoAziendale() {
        return costoAziendale;
    }
    public void setCostoAziendale(double costoAziendale) {
        this.costoAziendale = costoAziendale;
    }
    // Metodo astratto
    public abstract double getRedditoNetto();
}
class Dirigente extends Dipendente {
    public Dirigente(int persona, double costoAziendale) {
        super(persona, costoAziendale);
    }
    public double getRedditoNetto() {
        return 0.5 * getCostoAziendale();
    }
}
class Quadro extends Dipendente {
    private String responsabileDellArea;
    public Quadro(int persona, double costoAziendale, String responsabileDellArea) {
        super(persona, costoAziendale);
        this.responsabileDellArea = responsabileDellArea;
    }
    public String getResponsabileDellArea() {
        return responsabileDellArea;
    }
    public void setResponsabileDellArea(String responsabileDellArea) {
        this.responsabileDellArea = responsabileDellArea;
    }
    public double getRedditoNetto() {
        return 0.75 * getCostoAziendale();
    }
}
class Operaio extends Dipendente {
    private String mansione;
    private String area;

    public Operaio(int persona, double costoAziendale, String mansione, String area) {
        super(persona, costoAziendale);
        this.mansione = mansione;
        this.area = area;
    }
    public String getMansione() {
        return mansione;
    }
    public void setMansione(String mansione) {
        this.mansione = mansione;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public double getRedditoNetto() {
        return 0.9 * getCostoAziendale();
    }
}
public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new Dirigente(1, 5000);
        dipendenti[1] = new Quadro(2, 3000, "Responsabile Vendite");
        dipendenti[2] = new Operaio(3, 2000, "Operaio Specializzato", "Produzione");
        double totaleCostoAziendale = 0;
        for (Dipendente dipendente : dipendenti) {
            totaleCostoAziendale += dipendente.getCostoAziendale();
        }
        System.out.println("Totale costo aziendale: " + totaleCostoAziendale);
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Persona: " + dipendente.getPersona());
            System.out.println("Reddito Netto: " + dipendente.getRedditoNetto());
            System.out.println("------------------------------");
        }
    }
}