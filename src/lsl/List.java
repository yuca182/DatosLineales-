/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
 public class List extends ListaPadre{

     private ListNode current = firstNode;
     private ListNode ant;
     

     // construct empty List with "list" as the name
     public List(){
         this( "list" );
     }

     // construct an empty List with a name
     public List( String listName ){
        name = listName;
        firstNode = lastNode = null;
     }

     public void setFirstNode(Object item)
     {
          if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode( item );

        else // firstNode refers to new node
            firstNode.data = item;
     }

     public void setLastNode(Object item)
     {
        if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode( item );

        else // firstNode refers to new node
            lastNode.data = item;
     }
     

     // insert Object at front of List
     public synchronized void insertAtFront( Object insertItem ){
        if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode( insertItem );

        else // firstNode refers to new node
            firstNode = new ListNode( insertItem, firstNode );
     }

      public synchronized void insertInOrder(Object InsertItem){

        if(isEmpty())
            firstNode = lastNode = new ListNode(InsertItem);
        else{
            if(firstNode==lastNode){
                if((Integer)InsertItem > (Integer)firstNode.data)
                    insertAtFront(InsertItem);
                else
                    insertAtBack(InsertItem);
            }
            else{
                ListNode current = firstNode;
                ListNode anterior = null;
                while(current != null && (Integer)InsertItem < (Integer)current.data){
                    anterior=current;
                    current=current.nextNode;
                }
                if(anterior==null)
                    insertAtFront(InsertItem);
                else
                    if(anterior == lastNode){
                        insertAtBack(InsertItem);
                    }
                    else{
                    ListNode nuevo = new ListNode(InsertItem);
                    anterior.nextNode = nuevo;
                    nuevo.nextNode = current;
                    }
            }
        }

    }

      public synchronized void insertInOrder2(Object insertItem){
          if(isEmpty())
              firstNode = lastNode = new ListNode( insertItem );

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
                ListNode current = firstNode;
                ListNode anterior = firstNode;
                //anterior = current;
                //current = current.nextNode;
                current = current.nextNode;
                 while(current!=firstNode && (Integer)insertItem < (Integer)current.data){
                     anterior = current;
                     current = current.nextNode;
                 }
                 if(anterior==firstNode)
                     insertAtFront(insertItem);
                 else
                     if(anterior== lastNode)
                         insertAtBack(insertItem);

             else{
                 ListNode nuevo = new ListNode(insertItem);
                 anterior.nextNode = nuevo;
                 nuevo.nextNode = current;
             }
      }
 }

     }



     // insert Object at end of List
     public synchronized void insertAtBack( Object insertItem ){
         if ( isEmpty() ) // firstNode and lastNode refer to same Object
            firstNode = lastNode = new ListNode( insertItem );

         else // lastNode's nextNode refers to new node
            lastNode = lastNode.nextNode = new ListNode( insertItem );
     }

     public synchronized void removeObject(Object removeItem){
          ListNode current = firstNode;
          ListNode anterior = null;
          Boolean aux = false;
         if(isEmpty())
             System.out.println("El elemento no se encuetra. La lista esta vacia");
         else{
              if(lastNode==firstNode){
                 firstNode = lastNode = null;
             }
              else{
                  if((Integer)firstNode.data==(Integer)removeItem){
                     removeFromFront();
                 }
                  else{
                      if((Integer)lastNode.data==(Integer)removeItem){
                     removeFromBack();
                 }
                      else{
                          while((Integer)removeItem != (Integer)current.data && aux ==false) {
                            anterior = current;
                            if(current.nextNode!=null)
                            current = current.nextNode;
                            else{
                                System.out.println("El Elemento no se encuentra en la lista");
                                aux=true;
                            }

                      }
                           anterior.nextNode=current.nextNode;
                  }
              }
         }
     }

     }

     public synchronized void invierteLista(){
         ListNode current=firstNode;
         ListNode anterior=null;
         ListNode aux=lastNode;
         int cont=0;
         if(isEmpty())
             System.out.println("La lista esta vacía");
         else{
             if(lastNode==firstNode){
                 System.out.println("La lista solo tiene 1 elemento y no se puede invertir");
             }
             else{
                 while(current!=null){
                     current=current.nextNode;
                    cont++;
                 }
                 current=firstNode;
                 ListNode firstNode2=aux;
                 for(int i=1;i<cont;i++){
                     current=firstNode;
                   for(int j=1;j<cont-i;j++){
                       current=current.nextNode;
                   }
                      aux.nextNode=current;
                      aux=aux.nextNode;
                 }
                 aux.nextNode=null;
                 lastNode = aux;
                 firstNode = firstNode2;
                 
             }
         }
     }

      public synchronized void eliminaPar(){
         if(isEmpty())
             System.out.println("La lista esta vacía");
         else{
             ListNode current=firstNode;
             ListNode anterior=null;
             ListNode aux=null;
             while(current!=null){
                 if((Integer)(current.data)%2==0){
                     if(current==firstNode){
                         removeFromFront();
                         aux=current;
                     }
                     else{
                         if(current==lastNode){
                             removeFromBack();
                             aux=current;
                         }
                         else{
                             anterior.nextNode=current.nextNode;
                             aux=current;
                         }
                     }
                 }
                 if(current==aux){
                     current=current.nextNode;
                 }
                 else{
                     anterior=current;
                     current=current.nextNode;
                 }
             }
         }
      }

     public synchronized void removePenultimo(){
         if(isEmpty())
             System.out.println("El elemento no se encuetra. La lista esta vacia");
         else{
             if(lastNode==firstNode){
                 System.out.println("La lista no tiene penultimo elimento");
             }
             else{
                 ListNode current = firstNode;
                 ListNode anterior = null;
               int aux;
                   /* while((Integer)current.data != (Integer)lastNode.nextNode.data){
                        current = current.nextNode;
                        anterior = current;

                    }*/
                        aux = (Integer)lastNode.data;
                        removeFromBack();
                        removeFromBack();
                        insertAtBack(aux);
           }
         }
     }
     
     // remove first node from List
     public synchronized Object removeFromFront() throws EmptyListException{
         if ( isEmpty() ) // throw exception if List is empty
            throw new EmptyListException( name );

         Object removedItem = firstNode.data; // retrieve data being removed

         // update references firstNode and lastNode
         if ( firstNode == lastNode )
            firstNode = lastNode = null;
         else
            firstNode = firstNode.nextNode;

        return removedItem; // return removed node data
     } // end method removeFromFront

     // remove last node from List
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

         lastNode = current; // current is new lastNode
         current.nextNode = null;
         }

         return removedItem; // return removed node data
     } // end method removeFromBack

    public ListNode getFirstNode() {
        return firstNode;
    }

    public ListNode getLastNode() {
        return lastNode;
    }

    

   
 } // end class List



