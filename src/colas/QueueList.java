/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

import lsl.List;



/**
 *
 * @author Josue
 */
public class QueueList implements Queue {
private int contador;
private List lista;

public QueueList()
{
    contador=0;
    lista=new List();
}

    public int size() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return contador;
    }

    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return lista.isEmpty();
    }

    public void enqueue(Object o) {
        contador++;
        lista.insertAtFront(o);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object dequeue() throws QueueEmptyListException {

      Object objeto = null;
        try{
            objeto=lista.removeFromBack();
            contador--;
        }
        catch(Exception e){
            throw new QueueEmptyListException();
        }

      return objeto;
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object front() throws QueueEmptyListException {
           if(isEmpty())
        throw new QueueEmptyListException();
       else
           return lista.getLastNode().getObject();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String args[]){

        QueueList q=new QueueList();
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
