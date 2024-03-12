import java.util.HashSet;
import java.util.Set;

/*
1.Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi.

3.
 */
public class Main {
    public static void main(String[] args) {
        setSize();
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