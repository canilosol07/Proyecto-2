
public class Main {
    public static void main(String[] args) {
        MiLista miLista = new MiLista();
        System.out.println(miLista.toString());

        miLista.insertHead(0);

        //    System.out.println(miLista.toString());
        miLista.insertHead("Juan");
        miLista.insertHead(true);

//    System.out.println(miLista.toString());

        miLista.insertTail("Angela");

        System.out.println(miLista.toString());
        System.out.println(miLista.getSize());

        miLista.clear();

        System.out.println(miLista.toString());


        miLista.insertTail(12);
        miLista.insertTail(6);
        miLista.insertTail("Camilo");
        miLista.insertTail("Adriancito");
        miLista.insertTail("Calvo");
        System.out.println(miLista.toString());
        miLista.getSize();
        System.out.println(miLista.getSize());

        //Modulo getHead
        miLista.getHead();
        System.out.println(miLista.getHead());

        //Modulo getTail
        miLista.getTail();
        System.out.println(miLista.getTail());

        //Modulo isEmpty
        miLista.isEmpty();
        System.out.println(miLista.isEmpty());
        //Modulo toString
        miLista.set(miLista.cabeza,9);
        System.out.println(miLista.toString());
        //Modulo getBeforeTo
        System.out.println("aqui");
        System.out.println(miLista.getBeforeTo(miLista.cabeza));
        //Modulo getNextTo
        System.out.println(miLista.getNextTo(miLista.cabeza));
        //Modulo insert(ListNode node, Object object)
        System.out.println(miLista.insert(miLista.cabeza, "PRUEBA"));
        //Modulo search(Object object)
        System.out.println(miLista.search("Camilo"));
        //Moduelo get(ListNode node)
        System.out.println(miLista.get(miLista.cabeza));
        //Modulo add(Object object)
        System.out.println(miLista.add("add"));
        //Modulo insert(Object ob, Object object)
        System.out.println(miLista.insert(6, 7));
        //Modulo remove(ListNode node)
        System.out.println(miLista.remove(miLista.cabeza.siguiente));
        //Modulo contains(Object object)
        System.out.println(miLista.contains(6));
        System.out.println(miLista.contains(100000));
        //Modulo toArray(Object[] object)
        Object[] arreglo = miLista.toArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

}
