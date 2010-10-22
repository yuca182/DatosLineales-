/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */

public class ListDouble extends ListaPadre {


     // construct empty List with "list" as the name
     public ListDouble(){
         this( "list" );
     }

     // construct an empty List with a name
     public ListDouble( String listName ){
        name = listName;
        firstNode = lastNode = null;
     }

      public synchronized void insertAtFront( Object insertItem ){
           if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNodeDouble( insertItem );
           else{
             ListNodeDouble  nuevo = new ListNodeDouble(insertItem);
             nuevo.nextNode = firstNode;
             ((ListNodeDouble)firstNode).beforeNode=nuevo;
             firstNode = nuevo;
           }
      }

      public synchronized void insertAtBack( Object insertItem ){
          if ( isEmpty() ) // firstNode and lastNode refer to same Object
            firstNode = lastNode = new ListNodeDouble( insertItem );
          else{
              ListNodeDouble nuevo = new ListNodeDouble(insertItem);
              nuevo.beforeNode=(ListNodeDouble)lastNode;
              lastNode.nextNode=nuevo;
              lastNode=nuevo;

          }
      }

      public synchronized Object removeFromFront() throws EmptyListException{
           if ( isEmpty() ) // throw exception if List is empty
            throw new EmptyListException( name );
           Object removedItem = firstNode.data; // retrieve data being removed
           // update references firstNode and lastNode
         if ( firstNode == lastNode )
            firstNode = lastNode = null;
         else
            firstNode = (ListNodeDouble) firstNode.nextNode;
           ((ListNodeDouble)firstNode).beforeNode=null;

        return removedItem; // return removed node data
      }

      public synchronized Object removeFromBack() throws EmptyListException{
         if ( isEmpty() ) // throw exception if List is empty
             throw new EmptyListException( name );

        Object removedItem= lastNode.data; // retrieve data being removed

         // update references firstNode and lastNode
         if ( firstNode == lastNode )
             firstNode = lastNode = null;

         else { // locate new last node

         ListNode current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;

         lastNode = (ListNodeDouble) current; // current is new lastNode
         current.nextNode = null;
         }

         return removedItem; // return removed node data
     } // end method removeFromBack


      public synchronized void insertInOrder(Object InsertItem){

        if(isEmpty())
            firstNode = lastNode = new ListNodeDouble(InsertItem);
        else{
            if(firstNode==lastNode){
                if((Integer)InsertItem > (Integer)firstNode.data)
                    insertAtFront(InsertItem);
                else
                    insertAtBack(InsertItem);
            }
            else{
                ListNodeDouble current = (ListNodeDouble)firstNode;
                ListNodeDouble anterior = null;
                while(current != null && (Integer)InsertItem < (Integer)current.data){
                    anterior=current;
                    current=(ListNodeDouble)current.nextNode;
                }
                if(anterior==null)
                    insertAtFront(InsertItem);
                else
                    if(anterior == lastNode){
                        insertAtBack(InsertItem);
                    }
                    else{
                    ListNode nuevo = new ListNodeDouble(InsertItem);
                    anterior.nextNode = nuevo;
                    ((ListNodeDouble)nuevo).beforeNode = anterior;
                    nuevo.nextNode = current;
                    ((ListNodeDouble)current).beforeNode = (ListNodeDouble)nuevo;
                    }
            }
        }

    }

      public synchronized void insertInOrder2(Object insertItem){
          if(isEmpty())
              firstNode = lastNode = new ListNodeDouble( insertItem );

           else{
             if(firstNode==lastNode){
                 if((Integer)insertItem <(Integer)firstNode.data){
                     this.insertAtBack(insertItem);
                 }
                 else{
                     this.insertAtFront(insertItem);
                 }
             }

             else{
                ListNodeDouble current = (ListNodeDouble)firstNode;
                ListNodeDouble anterior = null;
                 while(current!=null && (Integer)insertItem < (Integer)current.data){
                     anterior = current;
                     current = (ListNodeDouble)current.nextNode;
                 }
                 if(anterior==null)
                     insertAtFront(insertItem);
                 else
                     if(anterior== lastNode)
                         insertAtBack(insertItem);

             else{
                 ListNodeDouble nuevo = new ListNodeDouble(insertItem);
                 anterior.nextNode = nuevo;
                 nuevo.nextNode = current;
                 nuevo.beforeNode=anterior;
                 current.beforeNode=nuevo;
             }
      }
 }

     }

   
        public synchronized void printBack(){
         if ( isEmpty()){
             System.out.println( "Empty " + name );
             return;
         }

     System.out.print( "The " + name + " is: " );

     ListNodeDouble current = (ListNodeDouble)lastNode;

     // while not at end of list, output current node's data
     while ( current != null ){
         System.out.print( current.data.toString() + " " );
         current =  (ListNodeDouble) current.beforeNode;
     }

     System.out.println( "\n" );

     }

          public ListNodeDouble getFirstNode() {
        return (ListNodeDouble) firstNode;
    }

    public ListNodeDouble getLastNode() {
        return (ListNodeDouble) lastNode;
    }


      public static void main( String args[] ){
         ListDouble lista = new ListDouble();
           lista.insertInOrder(5);
         lista.insertInOrder(10);
         lista.insertInOrder(7);
         lista.insertInOrder(1);
         lista.insertInOrder(6);
         lista.insertInOrder(4);
         lista.insertInOrder(2);
         lista.print();
      }

}
