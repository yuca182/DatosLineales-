/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deques;

import lsl.ListDouble;

/**
 *
 * @author usuario
 */
public class DequeStack implements Deque {

    private int contador;
    private  ListDouble doublelist;

    public DequeStack()
    {
        contador=0;
        doublelist=new ListDouble();
    }

    public int size() {

        return contador;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return doublelist.isEmpty();
    }

    public void insertFirst(Object o) {
        ///throw new UnsupportedOperationException("Not supported yet.");
        doublelist.insertAtFront(o);
        contador++;
    }

    public void insertLast(Object o) {
        //throw new UnsupportedOperationException("Not supported yet.");
        doublelist.insertAtBack(o);
        contador++;
    }

    public Object removeFirst() throws DequeEmptyException {
        Object objeto=null;
        try
        {
            objeto=doublelist.removeFromFront();
            contador--;
        }catch(Exception e){
        throw new DequeEmptyException();
        }
        return objeto;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object removeLast() throws DequeEmptyException {
        //throw new UnsupportedOperationException("Not supported yet.");
        Object objeto=null;
        try
        {
            objeto=doublelist.removeFromBack();
            contador--;
        }catch(Exception e){
        throw new DequeEmptyException();
        }
        return objeto;
    }

    public Object first() throws DequeEmptyException {
       return doublelist.getFirstNode().getObject();
    }

    public Object last() throws DequeEmptyException {
        return doublelist.getLastNode().getObject();
        
    }

    public static void main(String args[])
    {
        DequeStack deque =new DequeStack();
        deque.insertFirst(1);
        deque.insertFirst(2);
        deque.insertLast(3);
        deque.insertLast(4);
        System.out.println("First: "+deque.first()+"\n Last: "+deque.last());
    }


}
