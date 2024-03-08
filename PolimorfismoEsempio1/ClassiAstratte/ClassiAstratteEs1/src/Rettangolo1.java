public class Rettangolo1 extends Forma1 {
    private double lunghezza;
    private double larghezza;

    //costruttore
    public Rettangolo1(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;

    }
    public void calcolaArea (double lunghezza, double larghezza) {
        double area = lunghezza*larghezza;
        System.out.println( "L'area del rettangolo è: " + area);
    }
}


