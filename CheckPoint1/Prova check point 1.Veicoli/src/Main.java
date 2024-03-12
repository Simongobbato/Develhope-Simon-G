/*Definisci una enumerazione chiamata "TipoVeicolo" che rappresenta diversi tipi di veicoli
(es. AUTO, MOTO, CAMION, BICI).
Crea una classe astratta chiamata "Veicolo" che ha attributi comuni a tutti i veicoli
(es. targa, marca, modello) e metodi per ottenere e impostare questi attributi.
Estendi la classe "Veicolo" per creare classi concrete per ciascun tipo di veicolo definito
nell'enumerazione "TipoVeicolo". Ad esempio, potresti avere classi come "Auto", "Moto", "Camion",
 "Bicicletta".
Ogni classe concreta deve implementare metodi specifici per quel tipo di veicolo, ad esempio un
metodo "calcolaPedaggio" per calcolare il pedaggio basato sul tipo di veicolo.
Crea una classe principale chiamata "Main" che istanzia diversi oggetti di veicoli
(auto, moto, camion, bici), li gestisce tramite un array o una lista e chiama i metodi
 appropriati per mostrare il funzionamento del polimorfismo.
Questa traccia ti darà l'opportunità di esplorare l'ereditarietà creando una gerarchia
di classi, implementare il polimorfismo usando i metodi delle classi base e sottoclassi,
 e utilizzare enumerazioni per rappresentare insiemi di costanti correlate. Buon lavoro con l'esercizio!
 Se hai domande o hai bisogno di ulteriore assistenza, sono qui per aiutarti.*/
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AA123BB","Mercedes", "Classe A AMG", TipoVeicolo.AUTO);
        Camion camion1 = new Camion("BB456CC","Iveco", "Daily", TipoVeicolo.CAMION );
        Moto moto1 = new Moto("CC789DD", "Ducati", "Panigale", TipoVeicolo.MOTO);
        Bicicletta bicicletta1 = new Bicicletta("PedalaForte", "Scott", "Scale950", TipoVeicolo.BICICLETTA);
        Veicolo[] veicoli = new Veicolo[]{auto1, camion1, moto1, bicicletta1};
        for(Veicolo elemento: veicoli){
            System.out.println(elemento);
        }
    }
}