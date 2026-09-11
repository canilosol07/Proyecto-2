import java.util.Iterator;

public class MiLista implements ListInterface {
    ListNode cabeza;

    @Override
    public boolean isEmpty() {
        if (this.cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        ListNode iterador = this.cabeza;
        int contador = 1;
        while (iterador.siguiente != null) {
            iterador = iterador.siguiente;
            contador = contador + 1;
        }
        return contador;
    }

    @Override
    public void clear() {
        this.cabeza = null;
    }

    @Override
    public Object getHead() {
        return this.cabeza.dato;
    }

    @Override
    public Object getTail() {
        ListNode nodoTemporal = this.cabeza;
        while (nodoTemporal.siguiente != null)
            nodoTemporal = nodoTemporal.siguiente;
        return nodoTemporal.dato;
    }

    @Override
    public Object get(ListNode node) {
        ListNode cabeza =  this.cabeza;
        while (cabeza != null) {
            if (cabeza == node) {
                return cabeza.dato;
            }
            cabeza = cabeza.siguiente;
        }
        return null;
    }

    @Override
    public Object search(Object object) {
        ListNode cabeza = this.cabeza;
        while (cabeza != null) {
            if (cabeza.dato == object) {
                return cabeza.dato;
            }
            cabeza = cabeza.siguiente;
        }
        return null;
    }

    @Override
    public boolean add(Object object) {
       return insertTail(object);
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        if (node==null) {
        return false;
    }
        ListNode cabeza = this.cabeza;
        while (cabeza != null) {
            if (cabeza == node) {
                ListNode nuevoNodo = new ListNode(object);
                nuevoNodo.siguiente = node.siguiente;
                node.siguiente = nuevoNodo;
                return true;
            }
            cabeza = cabeza.siguiente;
        }
    return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        ListNode cabeza = this.cabeza;
        while (cabeza != null) {
            if (cabeza.dato == ob) {
                ListNode nuevoNodo = new ListNode(object);
                nuevoNodo.siguiente = cabeza.siguiente;
                cabeza.siguiente = nuevoNodo;
                return true;
            }
            cabeza = cabeza.siguiente;
        }
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        try {
            // 1er paso: Crear el nuevo nodo con la información recibida
            ListNode nuevaCabeza = new ListNode(object);
            //2do paso: Conectar el nodo a la cabeza
            nuevaCabeza.siguiente = this.cabeza;
            //3er paso: redefinir la cabeza
            this.cabeza = nuevaCabeza;
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            return false;
        }
    }

    @Override
    public boolean insertTail(Object object) {
        if (this.cabeza == null) {
            ListNode nuevaCabeza = new ListNode(object);
            this.cabeza = nuevaCabeza;
        } else {
            ListNode nuevaCola = new ListNode(object);
            ListNode iterador = this.cabeza;
            while (iterador.siguiente != null) {
                iterador = iterador.siguiente;

            }
            iterador.siguiente = nuevaCola;
        }
        return true;

    }

    @Override
    public boolean set(ListNode node, Object object) {
        node.dato = object;
        return true;
    }

    @Override
    public boolean remove(ListNode node) {
        ListNode cabeza = this.cabeza;
        while (cabeza.siguiente != null) {
            if (cabeza.siguiente == node) {
                cabeza.siguiente = node.siguiente;
                return true;
            }
            cabeza = cabeza.siguiente;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        ListNode cabeza =  this.cabeza;
        while (cabeza != null) {
            if (cabeza.dato == object){
                return true;
            }
            cabeza = cabeza.siguiente;
        }
        return false;
    }


    @Override
    public Object[] toArray() {
        Object[] arreglo = new Object[this.getSize()];

        ListNode actual = this.cabeza;
        int i = 0;

        while (actual != null) {

            arreglo[i] = actual.dato;
            i = i + 1;

            actual = actual.siguiente;
        }

        return arreglo;
    }

    @Override
    public Object[] toArray(Object[] object) {
        int size = getSize();
        if (object.length < size) {
            object = new Object[size];

        }
        ListNode cabeza = this.cabeza;
        int i = 0;

        while (cabeza != null) {
            object[i] = cabeza.dato;
            i = i+1;
            cabeza = cabeza.siguiente;
        }
        return object;
    }


    @Override
    public Object getBeforeTo(ListNode node) {
        ListNode iterador = this.cabeza;
        ListNode anterior = null;
        while (iterador.siguiente != null) {
            if (iterador == node) {
                if (anterior == null) {
                    return null;
                }
                return anterior.dato;

            }
            anterior = iterador;
            iterador = iterador.siguiente;
        }
        return null;
    }


    @Override
    public Object getNextTo(ListNode node) {
        return node.siguiente.dato;
    }

    @Override
    public MiLista subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public MiLista sortList() {
        return null;
    }

    @Override
    public String toString() {
        return "MiLista{" +
                "cabeza=" + cabeza +
                '}';
    }
}
