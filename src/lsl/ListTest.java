/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */

// ListTest class to demonstrate List capabilities.

 public class ListTest {

     public static void main( String args[] ){
         List list = new List(); // create the List container

         


         // insert references to objects in list
        /* list.insertAtFront( bool );
         list.print();
         list.insertAtFront( character );
         list.print();
         list.insertAtBack( integer );
         list.print();
         list.insertAtBack( string );
         list.print();*/
         list.insertInOrder(9);
         list.insertInOrder(2);
         list.insertInOrder(17);
         list.insertInOrder(1);
         list.print();
         // remove objects from list; print after each removal
        /* try {
            /* Object removedObject = list.removeFromFront();
             System.out.println( removedObject.toString() + " removed" );
             list.print();

             removedObject = list.removeFromFront();
             System.out.println( removedObject.toString() + " removed" );
             list.print();

             removedObject = list.removeFromBack();
             System.out.println( removedObject.toString() + " removed" );
             list.print();

             removedObject = list.removeFromBack();
             System.out.println( removedObject.toString() + " removed" );
             list.print();

         } // end try block

         // catch exception if remove is attempted on an empty List
         catch ( EmptyListException emptyListException ) {
             emptyListException.printStackTrace();
         }*/

     }

 } // end class ListTest