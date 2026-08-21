
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

        //Modulo add(object object)
    }

}
