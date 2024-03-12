public class Main {
    public static void main(String[] args){
        ProdottoSoftware[] prodotti = {
                new ProdottoSoftware("windows11", "Windows", "2023"),
                new ProdottoSoftware("linux", "23", "apritiCielo"),
                new ProdottoSoftware("apple", "mac", "2023")
        };
        System.out.println("prodotti con linux");
        for (ProdottoSoftware prodotto : prodotti ) {
            if (prodotto.getNome().equals("linux")) {
                System.out.println("nome :" + prodotto.getNome() + "sistemaOmperativo");
            }
        }
    }
}
