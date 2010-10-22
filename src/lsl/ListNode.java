/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */



public class ListNode {
    
     // package access members; List can access these directly
     Object data;
     ListNode nextNode;


     // create a ListNode that refers to object
     public ListNode( Object object ){
        this( object, null );
     }

     // create ListNode that refers to Object and to next ListNode
     ListNode( Object object, ListNode node ){
        data = object;
        nextNode = node;
     }

    

     // return reference to data in node
     public Object getObject(){
        return data; // return Object in this node
     }

     // return reference to next node in list
     public ListNode getNext(){
        return nextNode; // get next node
     }

     public void setNextNode(ListNode o)
    {
         nextNode=o;
    }

} // end class ListNode

 