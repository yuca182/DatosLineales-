/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import deques.DequeStack;

/*/*
import deques.DequeStack;

/**
 *
 * @author josue
 */
public class DequePila implements Stack{

    private DequeStack deque;

    public DequePila() {
        deque=new DequeStack();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void push(Object o) {
        deque.insertLast(o);
    }

    public Object pop() throws StackEmptyException {
      return  deque.removeLast();
    }

    public Object top() throws StackEmptyException {
        return deque.last();
    }

    public static void main(String args[]){
        StackList pila = new StackList();
        pila.push("Hola");
        pila.push("Pila!!!");
        pila.push(231);
        pila.push(34.5);
        while(!pila.isEmpty()){
            System.out.println("Hay" + pila.size() + "elementos en la pila");
            System.out.println(pila.pop());
        }
    }

}
