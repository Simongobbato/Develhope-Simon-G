/*Realizzare una classe Evento con
attributi:
        - Nome
- Data
- CostoBiglietto

Realizzare due sottoclassi EventoDalVivo e
EventoInRemoto.

La classe EventoDalVivo avrà l'attributo
        - Luogo
- NumeroPosti

Mentre l'EventoInRemoto avraà l'attributo
- Link

Creare una classe Eventi che contiene una
mappa di eventi.
La classe eventi dovrà permettere di:
        - Inserire un evento con nome univoco nella
mappa (non devono esistere due eventi con lo
                stesso nome)
- Cercare un evento per nome che contiene una
certa porzione di stringa (es. se ho l'evento
        "Introduzione a java" e cerco per "duzi" devo
        averlo in ritorno)
- Cercare un evento all'interno di un range di
date.

Creare una classe main e testare tutte le
funzionalità.


Funzionalità aggiuntive:
        - Stampare tutti gli eventi dal vivo
- Realizzare un sistema che
- Calcolare l'incasso massimo che si può
ottenere da un evento dal vivo*/
public class Main {
    public static void main(String[] args) {
        EventoDalVivo eventoDalVivo = new
                EventoDalVivo();
        IncassoMassimo incassoMassimo =
                new IncassoMassimo();
        String IncassoMassimo;
        System.out.println("IncassoMassimo:"
                + IncassoMassimo);
        /* - Calcolare l'incasso massimo che
        si può
        ottenere da un evento dal vivo*/
        IncassoMassimo incassoMassimo1 = new
                IncassoMassimo();

    }
}