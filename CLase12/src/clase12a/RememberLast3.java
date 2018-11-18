package clase12a;

public class RememberLast3<T> {

    private T lastElement;
    private T prevLast;
    private int numOfElements;

    public RememberLast3() {
        numOfElements = 0;
        lastElement = null;
    }
    /*
    *   Checked excepcions deben ser declaradas 
    *   NullPointerException es unChecked excepcion
    *   por lo tanto, no es obligatorio, pero se puede hacer!.
    *   Puede averiguear más acá: 
    *   https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
    * 
    */
    public T add(T element) throws NullPointerException{

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
