public class Triangolo extends Forma {
    private double lunghezza;
    private double altezza;

    public Triangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public void calcolaArea(double lunghezza, double altezza) {
        double area = lunghezza * altezza;
        System.out.println("L'area del triangolo è: " + area);
    }
}