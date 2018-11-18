package clase12a;

public class RememberLast2<T> {

    private T lastElement;
    private T prevLast;
    private int numOfElements;

    public RememberLast2() {
        numOfElements = 0;
        lastElement = null;
    }

    public T add(T element) {

        if (element == null) {
            //<< Qué agregar aquí >>
            // Le digo a Java que se encargue del problema ;)
            throw new NullPointerException("El objeto RememberLast2 "
                    + "no almacena null pointers ");
        }
        prevLast = lastElement;
        lastElement = element;
        numOfElements++;
        return prevLast;
    }

}
