//Si vuole creare un'applicazione che gestisce il personale di un'azienda.
//Solitamente, un'azienda ha almeno 3 tipologie di dipendenti: i dirigenti, i quadri, e gli operai.
//Questi si distinguono in quanto:
//- i dirigenti svolgono operazioni di direzione strategica, non sono associati a specifici reparti
//- i quadri si occupano della gestione di una specifica area aziendale e delle operazioni e del
// personale della loro  area
//- gli operai appartengono ad un'area e svolgono una mansione specifica nell'area di
// appartenenza
//Creare una classe astratta Dipendente su cui gestire opportunamente l'incapsulamento
// (getter/setter/visibilità), che abbia i seguenti attributi:
//- matricola
//- costoAziendale
//e il metodo astratto getRedditoNetto()
//
//Creare due sottoclassi di Dipendente: Dirigente, Quadro, Operaio
//
//Per la classe dirigente: non introdurre nuovi campi
//Per la classe Quadro introdurre il campo: responsabileDellArea di tipo String
//Per la classe Operaio introdurre il campo: mansione di tipo String, area di tipo String

public class Main {
    public static void main(String[] args) {
        char dirigenti = " operazioniDirezioneStrategica " ;
        char quadri = " gestione specifica area aziendale e operazioni del personale area propria";
        char operaio = " appartiene a un'area e svolge una mansione specifica all'interno dell'area ";

    }
}
