/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06_netbeans;

/**
 *
 * @author souriez
 */
public class LLNode<E>{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Añadir cualquier otro método que usted crea sea útil aquí
	// Por ejemplo, usted puede querer/necesitar otro constructor 
	// También puede requerir mover esta clae de acá. Puede hacerlo.

	public LLNode(E e){
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
