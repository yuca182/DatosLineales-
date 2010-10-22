/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deques;

/**
 *
 * @author usuario
 */
public interface Deque {

    public int size();
    public boolean isEmpty();
    public void insertFirst(Object o);
    public void insertLast(Object o);
    public Object removeFirst() throws DequeEmptyException;
    public Object removeLast()throws DequeEmptyException;
    public Object first() throws DequeEmptyException;
    public Object last() throws DequeEmptyException;



}
