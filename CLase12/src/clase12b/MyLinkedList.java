package clase12b;


public class MyLinkedList<E> {

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public MyLinkedList() {
        size = 0;
        head = new ListNode<E>(null);
        tail = new ListNode<E>(null);
        head.next = tail;
        tail.prev = head;
    }
    
    public int size(){
        return this.size;
    }
    
    public E get(E element){
        
    }
    
    public E add(E element){
        if(size == 0){
            size++;
            head = new ListNode<E>(element);
            
        }
        
    }
    
    public E add(int index, E element){
        
    }
    
    
    
    
    
    

}
