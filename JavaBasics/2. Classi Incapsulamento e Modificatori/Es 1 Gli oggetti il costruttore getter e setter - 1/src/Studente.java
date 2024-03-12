import static com.sun.tools.javac.main.Option.G;

public class Studente {
    private String nome;
    private String cognome;
    int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCgnome(String cognome) {
        this.cognome = cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cgnome='" + cognome + '\'' +
                ", identificativo=" + identificativo +
                '}';
    }
}
