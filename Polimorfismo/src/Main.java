/*Scrivere un programma che contenga una classe chiamata Animale
 ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso()
per miagolare. Prova quindi a far stampare il verso di Animale e di Gatto.*/
public class Main {
    public static void main(String[]args){
        Animale animale = new Animale();
        Cane cane = new Cane();
        Labrador labrador = new Labrador();
        PastoreTedesco pastoreTedesco = new PastoreTedesco();
        Gatto gatto = new Gatto();
        System.out.println("Animale :" + animale);
        System.out.println("Cane :" + cane);
        System.out.println("Labrador :" + labrador);
        System.out.println("PastoreTedesco :" + pastoreTedesco);
        System.out.println("Gatto :" + gatto);
    }
}