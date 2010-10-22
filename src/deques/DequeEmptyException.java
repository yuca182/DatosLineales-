/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deques;

import colas.*;

/**
 *
 * @author usuario
 */
public class DequeEmptyException extends RuntimeException {

         public DequeEmptyException(){
        this( "Deque" );
        // call other EmptyListException constructor
     }

     // constructor
     public DequeEmptyException( String name ){
        super( name + " is empty" ); // call superclass constructor
     }


}
