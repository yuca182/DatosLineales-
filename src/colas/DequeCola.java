/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

import deques.DequeStack;

/**
 *
 * @author josue
 */
public class DequeCola implements Queue{

    private DequeStack deque;

    public DequeCola() {
        deque=new DequeStack();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void enqueue(Object o) {
        deque.insertLast(o);
    }

    public Object dequeue() throws QueueEmptyListException {
       return deque.removeLast();
    }

    public Object front() throws QueueEmptyListException {
       return deque.first();
    }


     public static void main(String args[]){

        DequeCola q=new DequeCola();
       // q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(4);

        while(!q.isEmpty())
        {
             System.out.println("Hay " + q.size() + " elementos en la cola, last: "+q.front());
            System.out.println(q.dequeue());
        }
    }


}
