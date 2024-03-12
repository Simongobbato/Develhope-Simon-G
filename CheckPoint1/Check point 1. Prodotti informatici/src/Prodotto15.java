//Si consideri lo scenario di un'azienda che vende prodotti sofrware.
//
//L'azienda avrà una unsieme di prodotti software che può fornire ai suoi clienti,
// i prodotti software possono essere acquistati sia con licenza a vita che noleggiati
// per determinati intervalli di tempo.
//
//Si consideri quindi la classe Prodotto Software con i seguenti attributi:
//
//- nome
//- sistemaOperativo
//- categoria
//
//
//Si consideri poi l'interfaccia Noleggiabile che dichiara il metodo Noleggiami, il quale aggiornerà
// lo stato del prodotto in noleggiato
//
//Si consideri il ProdottoSoftwareNoleggiabile, che estende ProdottoSofware e implementa Noleggiamo,
// il quale
//- ha una variabile noleggiato
//- implementa i metodi necessari
//
//Si realizzi poi un main un un array di prodotti software e si stampi a video solo i prodotti
// sofrwware che hanno come sistemaOperativo supportato 'Linux'.
//
//- Si realizzi un sistema per stampare a video lo stato di noleggio di tutti i software noleggiati

public class Prodotto15{
    //dichiaro le stringhe
    private String nome;
    private String sistemaOperativo;
    private String categoria;
    public Prodotto15(String nome, String sistemaOperativo, String categoria)/*istanza*/ {
        this.nome = nome;
        this.sistemaOperativo = sistemaOperativo;
        this.categoria = categoria;
    }
    public String getNome() {// schiaccio in combinazione alt+ins e clicco get
        return nome;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {//schiaccio in combinazione alt+ins e clicco setter
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}


