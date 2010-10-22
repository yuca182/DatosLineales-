/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import lsl.List;

/**
 *
 * @author josue
 */
public class StackList implements Stack {
    private List lista;
    public int contador;

    public StackList(){
        lista = new List();
        contador=0;
    }

    public int size(){
        return contador;
    }
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    public void push(Object o){
        lista.insertAtFront(o);
        contador++;
    }
    public Object pop() throws StackEmptyException{
        Object objeto = null;
        try{
            objeto=lista.removeFromFront();
            contador--;
        }
        catch(Exception e){
            throw new StackEmptyException();
        }
        return objeto;
    }

    public Object top() throws StackEmptyException {
       if(isEmpty())
        throw new StackEmptyException();
       else
           return lista.getFirstNode().getObject();
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
