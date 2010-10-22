/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

import lsl.List;
import lsl.ListNode;

/**
 *
 * @author usuario
 */
public class Pista implements PriQueue{
private List lista;
private int contador;

    public Pista() {
    lista=new List();
    contador=0;
    }


    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public void insert(Object item)
    {
        
        insertItem(item,((Vuelo)item).getPrioridad());
        contador++;
    }

    public void insertItem(Object item, int k) {
 if(lista.isEmpty())
     lista.setLastNode(item);
     ///firstNode = lastNode = new ListNode(InsertItem);
        else{
            if(lista.getFirstNode()==lista.getLastNode()){
                if(((Vuelo)item).getPrioridad() > ((Vuelo)lista.getFirstNode().getObject()).getPrioridad())
                    lista.insertAtFront(item);
                else
                    lista.insertAtBack(item);
            }
            else{
                ListNode current = lista.getFirstNode();
                ListNode anterior = null;
                while(current != null && ((Vuelo)item).getPrioridad() < ((Vuelo)current.getObject()).getPrioridad()){
                    anterior=current;
                    current=current.getNext();
                }
                if(anterior==null)
                    lista.insertAtFront(item);
                else
                    if(anterior == lista.getLastNode()){
                        lista.insertAtBack(item);
                    }
                    else{
                    ListNode nuevo = new ListNode(item);
                    anterior.setNextNode(nuevo);
                    //nuevo.nextNode = current;
                    nuevo.setNextNode(current);
                    }
            }
        }
    }

    public Object minEle() throws PriQueueEmptyException {
        return lista.getLastNode().getObject();
    }

    public Object removeMinEle() throws PriQueueEmptyException {
        contador--;
        return lista.removeFromBack();
       
    }

    public int minKey() throws PriQueueEmptyException {
        return ((Vuelo)lista.getLastNode().getObject()).getPrioridad();
    }


    public static void main(String args[])
    {
        Vuelo v1=new Vuelo("Volaris",556,9),v2=new Vuelo("Aeromexico",880,40),v3=new Vuelo("Aerobus",256,3),v4=new Vuelo("Volaris",945,5);

        Pista pista=new Pista();

        pista.insert(v1);
        
        pista.insert(v2);
        pista.insert(v3);

        pista.insert(v4);
        System.out.println(pista.minKey());

        while(!pista.isEmpty())
        {
            System.out.println(((Vuelo)pista.minEle()).toString());
         pista.removeMinEle();
        
    }
}
}
