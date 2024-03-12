import java.util.HashSet;
import java.util.Set;

/*
2.Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> numeriInteri = setSize();
        Integer setSize = 60;
        System.out.println(numeriInteri.contains(setSize));
    }

    public static HashSet<Integer> setSize() {
        HashSet<Integer> setDiInteri = new HashSet<>();
        setDiInteri.add(60);
        setDiInteri.add(50);
        setDiInteri.add(40);
        System.out.println(setDiInteri);
        System.out.println(setDiInteri.size());
        return setDiInteri;
    }
}