// Classe Dipendente
abstract class Dipendente {
    private int Persona;
    private double costoAziendale;

    public Dipendente(int personaa, double costoAziendale) {
        this.Persona = Persona;
        this.costoAziendale = costoAziendale;
    }

    public int getPersona() {
        return Persona;
    }

    public void setMatricola(int persona) {
        this.Persona = persona;
    }

    public double getCostoAziendale() {
        return costoAziendale;
    }

    public void setCostoAziendale(double costoAziendale) {
        this.costoAziendale = costoAziendale;
    }

    public abstract double getRedditoNetto();
}

// Classe Dirigente
class Dirigente extends Dipendente {
    public Dirigente(int persoana, double costoAziendale, int persona) {
        super(persona, costoAziendale);
    }

    @Override
    public double getRedditoNetto() {
        return 0.5 * getCostoAziendale();
    }

    private class Persona {
    }
}

// Classe Quadro
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

    @Override
    public double getRedditoNetto() {
        return 0.75 * getCostoAziendale();
    }
}

// Classe Operaio
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

    @Override
    public double getRedditoNetto() {
        return 0.9 * getCostoAziendale();
    }
}

// Classe Operazione
class Operazione {
    private String descrizione;
    private String livelloResponsabilita;

    public Operazione(String descrizione, String livelloResponsabilita) {
        this.descrizione = descrizione;
        this.livelloResponsabilita = livelloResponsabilita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getLivelloResponsabilita() {
        return livelloResponsabilita;
    }
}

// Classe Autorizzazione
class Autorizzazione {
    private Operazione[] operazioni;

    public Autorizzazione(Operazione[] operazioni) {
        this.operazioni = operazioni;
    }

    public boolean autorizza(Dipendente dipendente, Operazione operazione) {
        for (Operazione op : operazioni) {
            if (op.getDescrizione().equals(operazione.getDescrizione()) &&
                    op.getLivelloResponsabilita().equals(dipendente.getClass().getSimpleName())) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int persona = 1;
        Dipendente[] dipendenti = {
                new Dirigente(1, 8000, persona),
                new Quadro(2, 4000, "Responsabile Vendite"),
                new Operaio(3, 2500, "Operaio Specializzato", "Produzione")
        };

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

        // Scenari di autorizzazione
        Operazione acquistoOperazione = new Operazione("Acquisto materiale", "Quadro");
        Operazione assemblaggioOperazione = new Operazione("Assemblaggio prodotto", "Operaio");

        Operazione[] operazioni = {acquistoOperazione, assemblaggioOperazione};
        Autorizzazione autorizzazione = new Autorizzazione(operazioni);

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Dipendente con persona " + dipendente.getPersona() +
                    " autorizzato per l'operazione di acquisto: " + autorizzazione.autorizza(dipendente, acquistoOperazione));
            System.out.println("Dipendente con persona " + dipendente.getPersona() +
                    " autorizzato per l'operazione di assemblaggio: " + autorizzazione.autorizza(dipendente, assemblaggioOperazione));
            System.out.println("------------------------------");
        }
    }
}