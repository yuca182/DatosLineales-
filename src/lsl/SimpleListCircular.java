/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
public class SimpleListCircular extends List{

    @Override
    public synchronized void insertAtFront( Object insertItem ){
        super.insertAtFront(insertItem);
        lastNode.nextNode=firstNode;
     }

    @Override
    public synchronized void insertAtBack( Object insertItem ){
        super.insertAtBack(insertItem);
        lastNode.nextNode=firstNode;
    }

    @Override
    public synchronized void insertInOrder2( Object insertItem ){
        super.insertInOrder2(insertItem);
        lastNode.nextNode=firstNode;
    }

    @Override
     public synchronized void insertInOrder( Object insertItem ){
        super.insertInOrder(insertItem);
        lastNode.nextNode=firstNode;
    }

    @Override
    public synchronized Object removeFromFront() throws EmptyListException{
        Object objeto = super.removeFromFront();
        if(lastNode != null)
        lastNode.nextNode=firstNode;
        return objeto;
    }

    @Override
    public synchronized Object removeFromBack() throws EmptyListException{
        Object objeto = super.removeFromBack();
         if(lastNode != null)
        lastNode.nextNode=firstNode;
        return objeto;
    }

    @Override
     public synchronized void print(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNode current = firstNode;

     System.out.print( current.data.toString() + " " );
     current = current.nextNode;

     while ( current != firstNode ){
         System.out.print( current.data.toString() + " " );
         current = current.nextNode;
     }

     System.out.println( "\n" );

     }

     public static void main(String args[]){
         SimpleListCircular lista = new SimpleListCircular();
//         lista.insertAtBack(234);
//         lista.insertAtBack("hola");
//         lista.insertAtFront("primero");
         lista.insertInOrder(5);
         lista.insertInOrder(10);
         lista.insertInOrder(7);
         lista.insertInOrder(1);
         lista.insertInOrder(6);
         lista.insertInOrder(4);
         lista.insertInOrder(2);
         lista.print();
//         lista.removeFromFront();
//         lista.removeFromBack();
//         lista.print();
     }

}
