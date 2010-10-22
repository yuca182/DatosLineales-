/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
public class DoubleListCircular extends ListDouble{

    @Override
    public synchronized void insertAtFront( Object insertItem ){
        super.insertAtFront(insertItem);
        lastNode.nextNode=firstNode;
        ((ListNodeDouble)firstNode).beforeNode = (ListNodeDouble) lastNode;
     }

    @Override
    public synchronized void insertAtBack( Object insertItem ){
        super.insertAtBack(insertItem);
        lastNode.nextNode=firstNode;
        ((ListNodeDouble)firstNode).beforeNode = (ListNodeDouble) lastNode;
    }

     @Override
     public synchronized void insertInOrder( Object insertItem ){
        super.insertInOrder(insertItem);
        lastNode.nextNode=firstNode;
        ((ListNodeDouble)firstNode).beforeNode = (ListNodeDouble) lastNode;
    }

    @Override
     public synchronized Object removeFromFront() throws EmptyListException{
        Object objeto = super.removeFromFront();
        if(lastNode != null)
        lastNode.nextNode=firstNode;
        ((ListNodeDouble)firstNode).beforeNode = (ListNodeDouble) lastNode;
        return objeto;
    }

    @Override
    public synchronized Object removeFromBack() throws EmptyListException{
        Object objeto = super.removeFromBack();
         if(lastNode != null)
        lastNode.nextNode=firstNode;
         ((ListNodeDouble)firstNode).beforeNode = (ListNodeDouble) lastNode;
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

    @Override
      public synchronized void printBack(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNodeDouble current = (ListNodeDouble)lastNode;
     System.out.print( current.data.toString() + " " );
     current = (ListNodeDouble) current.beforeNode;
     

     // while not at end of list, output current node's data
     while ( current != lastNode ){
         System.out.print( current.data.toString() + " " );
         current =  (ListNodeDouble) current.beforeNode;
     }

     System.out.println( "\n" );

     }
         public static void main(String args[]){
         DoubleListCircular lista = new DoubleListCircular();
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
         lista.printBack();
         }


}
