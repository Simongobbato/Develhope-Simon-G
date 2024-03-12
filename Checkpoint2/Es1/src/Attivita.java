import java.time.LocalDate;

public abstract class Attivita {
    private String nome;
    private String tipoAttivita;
    public  LocalDate data;

    public Attivita(String nome, String tipoAttivita, LocalDate data) {
        this.nome = nome;
        this.tipoAttivita = tipoAttivita;
        this.data = data;
    }
    public abstract void Svolgi();
}
