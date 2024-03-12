/*Immagina di gestire un piccolo magazzino di prodotti alimentari. Devi sviluppare
un programma per:

    Memorizzare i prodotti:
        Nome
        Codice a barre
        Data di scadenza
        Quantità in magazzino
    Gestire le vendite:
        Registrare la vendita di un prodotto, aggiornando la quantità in magazzino
    Ricercare prodotti:
        Trovare un prodotto per nome o codice a barre
        Trovare i prodotti in scadenza entro una certa data
    Visualizzare i prodotti:
        Stampare l'elenco completo dei prodotti
        Stampare l'elenco dei prodotti in ordine alfabetico
        Stampare l'elenco dei prodotti in ordine di scadenza

Istruzioni:

    Crea una classe Prodotto che includa:
        Attributi: nome, codice a barre, data di scadenza, quantità
        Costruttore per inizializzare gli attributi
        Metodi getter e setter per gli attributi
        Metodo toString() per stampare le informazioni del prodotto

    Crea una classe Magazzino che includa:
        Un HashMap per memorizzare i prodotti
        Metodi per:
            Aggiungere un prodotto al magazzino
            Rimuovere un prodotto dal magazzino
            Trovare un prodotto per nome o codice a barre
            Registrare la vendita di un prodotto
            Stampare l'elenco completo dei prodotti
            Stampare l'elenco dei prodotti in ordine alfabetico
            Stampare l'elenco dei prodotti in ordine di scadenza

    Implementa l'interfaccia Comparable nella classe Prodotto per ordinare i prodotti:
        Definisci il metodo compareTo() per confrontare due prodotti in base alla data di scadenza

    Utilizza la classe Collections per ordinare e ricercare i prodotti:
        Ordina i prodotti in base alla data di scadenza
        Trova i prodotti in scadenza entro una certa data

    Scrivi un metodo main per testare le funzionalità del programma:
        Crea alcuni oggetti Prodotto
        Aggiungi i prodotti al magazzino
        Registra la vendita di alcuni prodotti
        Stampa l'elenco completo dei prodotti
        Stampa l'elenco dei prodotti in ordine alfabetico
        Stampa l'elenco dei prodotti in ordine di scadenza
        Trova i prodotti in scadenza entro una certa data

Estensioni:

    Aggiungi la possibilità di gestire diverse categorie di prodotti
    Implementa un sistema di autenticazione per l'accesso al programma
    Gestisci la persistenza dei dati su un file*/
public class Main {
    public static void main(String[]args){
        Prodotto prodotto = new Prodotto();

    }
}