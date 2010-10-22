/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 * @author usuario
 */
public class QueueEmptyListException extends RuntimeException {

         public QueueEmptyListException(){
        this( "Pila" );
        // call other EmptyListException constructor
     }

     // constructor
     public QueueEmptyListException( String name ){
        super( name + " is empty" ); // call superclass constructor
     }


}
