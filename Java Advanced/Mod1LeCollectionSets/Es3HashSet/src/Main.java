import java.util.HashSet;
import java.util.Set;

/*
3.Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> numeriInteri = setSize();
        Integer number = 30;
        Integer found = null;
        System.out.println(numeriInteri.contains(number));
        for (Integer elemento : numeriInteri){
            if(number.equals(elemento)){
                found = elemento;
            }
        }
        numeriInteri.remove(found);
        System.out.println(numeriInteri);
        numeriInteri.clear();
        System.out.println(numeriInteri);
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