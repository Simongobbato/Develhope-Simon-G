import java.time.LocalDate;

public class Docente extends Persona{
    public String materia;
    public double stipendio;

    public Docente(String nome, String cognome,
                   LocalDate dataNascita, String materia, double stipendio) {
        super(nome, cognome, dataNascita);
        this.materia = materia;
        this.stipendio = stipendio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "materia='" + materia + '\'' +
                ", stipendio=" + stipendio +
                '}';
    }
}
