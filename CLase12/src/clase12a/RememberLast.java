package clase12a;

public class RememberLast<T> {

    private T lastElement;
    private T prevLast;
    private int numOfElements;

    public RememberLast() {
        numOfElements = 0;
        lastElement = null;
    }

    public T add(T element) {
        prevLast = lastElement;
        lastElement = element;
        numOfElements++;
        return prevLast;
    }

}
