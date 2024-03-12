public class Eventi { //contiene la mappa di eventi
    HashMap<Integer,String> Evento = new HashMap<Integer,String>();
  Evento.put(1, "Evento Introduzione Java");
  Evento.put(2, "Evento Introduzione JavaScript");
  for(Integer key : Evento.keySet()) {
        System.out.println(Evento.get(key));
    }
}
