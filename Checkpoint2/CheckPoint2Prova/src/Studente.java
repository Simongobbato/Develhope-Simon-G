import java.time.LocalDate;

public class Studente extends Persona{
    public String matricola;
    public String corsoDiStudi;

    public Studente(String nome, String cognome,
                    LocalDate dataNascita, String matricola,
                    String corsoDiStudi) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola='" + matricola + '\'' +
                ", corsoDiStudi='" + corsoDiStudi + '\'' +
                '}';
    }
}
