/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
    
 // Class EmptyListException declaration.

 public class EmptyListException extends RuntimeException{

     // no-argument constructor
     public EmptyListException(){
        this( "List" );
        // call other EmptyListException constructor
     }

     // constructor
     public EmptyListException( String name ){
        super( name + " is empty" ); // call superclass constructor
     }

 } // end class EmptyListException