public class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public void calcolaArea(double lunghezza, double larghezza) {
        double area = lunghezza * larghezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
