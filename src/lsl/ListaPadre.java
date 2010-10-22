/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
public abstract class ListaPadre {
    protected ListNode firstNode;
    protected ListNode lastNode;
    protected String name;

     public abstract void insertAtFront(Object insertItem);
     public abstract void insertAtBack(Object insertItem);
     public abstract Object removeFromFront();
     public abstract Object removeFromBack();
     public abstract void insertInOrder2(Object insertItem);

     public synchronized boolean isEmpty(){
        return firstNode == null; // return true if List is empty
     }

    // output List contents
     public synchronized void print(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNode current = firstNode;

     // while not at end of list, output current node's data
     while ( current != null ){
         System.out.print( current.data.toString() + " " );
         current = current.nextNode;
     }

     System.out.println( "\n" );

     }


}
