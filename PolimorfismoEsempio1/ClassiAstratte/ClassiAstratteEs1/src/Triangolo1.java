public class Triangolo1 extends Forma1{
    private double lunghezza;
    private double altezza;

    //costruttore
    public Triangolo1(double lunghezza, double altezza){
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    public void calcolaArea (double lunghezza, double altezza) {
        double area = lunghezza * altezza;
        System.out.println( "L'area del triangolo è: " + area);
    }
}