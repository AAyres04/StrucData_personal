package lab_06_netbeans;

import java.util.AbstractList;
import java.lang.IndexOutOfBoundsException;

/** Una clase que implementa un lista doble enlazada
 * 
 * @author Pablo Valenzuela
 *
 * @param <E> El tipo de elemento almacenado en la lista. (Note que es un elemento genérico)
 */
public class MiListaEnlazada<E> extends AbstractList<E> {
	
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Crea una nueva ListaEnlazada vacía */
	public MiListaEnlazada(){
		// Hacer: Implementar este método
                size = 0;
                head = new LLNode<E>(null);
                tail = new LLNode<E>(null);
                head.next = tail;
                tail.prev = head;
	}

	/**
	 * Agregar un elemento al final de la lista
	 * @param element El elemento a agregar
	 */
	public boolean add(E element){
		// Hacer: Implementar este método
                if(element != null){
                    if(head.data == null){
                        head.data = element;
                        size++;
                        return true;
                    }else if(tail.data == null){
                        tail.data = element;
                        size++;
                        return true;
                    }else{
                        tail.next = new LLNode(element);
                        tail.next.prev = tail;
                        tail = tail.next;
                        size++;
                        return true;
                    }
                    
                }
		return false;
	}

	/** Obtener el elemento en la posición index 
	 * @throws IndexOutOfBoundsException Si el índice está fuera del límite de la lista.  
	 */
	public E get(int index) {
		// Hacer: Implementar este método 
		LLNode<E> aux;
                aux = head;
                
                for(int i =0; i<size; i++){
                    if(index==i){
                        return aux.data;
                    }
                    aux = aux.next;
                }
                throw new IndexOutOfBoundsException("el indice ingresado esta fuera del rango");
	}

	/**
	 * Agregar un elemento a la lista en la posición index
	 * 
	 * @param index El índice donde el elemento debería ser agregado
	 * @param element El elemento a agregar
	 */
	public void add(int index, E element){
		// Hacer: Implementar este método 
                
                LLNode<E> aux;
                aux = head;
                
                LLNode<E> newNode;
                
                if(element != null){
                    for(int i = 0; i<size;i++){
                        if(head.data == null && i == 0){
                            head.data = element;
                            size++;
                            break;
                        }else if(tail.data == null && i == 1){
                            tail.data = element;
                            size++;
                            break;
                        }else if(index==0){
                            //nuevo head
                            aux = head.next;
                            head.next = head;


                        }else if(index==i && i<size-1){
                            newNode = new LLNode(element);
                            newNode.next = aux;
                            newNode.prev = aux.prev;
                            aux.prev.next = newNode;
                            aux.prev = newNode;
                            size++;

                        }else if(index==i && i==size-1){
                            //nuevo tail
                        }

                        aux = aux.next;
                    }
                }
                
                
	}


	/** Retorna el tamaño de la lista */
	public int size(){
		// Hacer: Implementar este método
		return this.size;
	}

	/** Remueve un node según el índice especificado y retorna su data element.
	 * @param index El índice del elemento a remover
	 * @return El data element removido
	 * @throws IndexOutOfBoundsException Si el índice está fuera del límite de la lista. 
	 */
	public E remove(int index){
		// Hacer: Implementar este método
		return null;
	}

	/**
	 * Establece un índice en la lista para un nuevo elemento
	 * @param index El índice del elemento a modificar
	 * @param element El nuevo elemento
	 * @return El elemento que fue reemplazado
	 * @throws IndexOutOfBoundsException Si el índice está fuera del límite de la lista.
	 */
	public E set(int index, E element){
		// Hacer: Implementar este método
		return null;
	}   
}


