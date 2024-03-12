import java.time.LocalDate;
import java.util.Map;

public class Ateneo {
    Map<Persona,String>ABCDEF12A34B567C;
    public void Persona (){
        String nome;
        String cognome;
        LocalDate dataDiNascita;
    }
    public static class PersonaNonEsisteException extends RuntimeException {

        public PersonaNonEsisteException() {
            super("La persona non esiste");
        }

        public PersonaNonEsisteException(String causa) {
            super("La persona non esiste: " + causa);
        }
    }

}
