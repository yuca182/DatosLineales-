/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

import lsl.EmptyListException;

/**
 *
 * @author usuario
 */
public interface Queue {

   


    public int size();
    public boolean isEmpty();
    public void enqueue(Object o);
    public Object dequeue() throws QueueEmptyListException;
    public Object front() throws QueueEmptyListException;
}
