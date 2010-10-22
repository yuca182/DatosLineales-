/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author josue
 */
public class PruebaListasDobles {
    public static void main( String args[] ){
        ListDouble list = new ListDouble();

//        list.insertAtFront(5);
//        list.insertAtFront(6);
//        list.insertAtFront(17);
//        list.insertAtFront(1);
//        list.insertAtFront(9);
//        list.insertAtFront(12);
//        list.insertAtBack(15);
//        list.insertAtBack(4);
//        list.insertAtFront(22);
//        list.insertAtFront(3);
//        list.print();
        //list.printBack();
        //list.removeFromFront();
        //list.removeFromBack();
        list.insertInOrder(16);
        list.insertInOrder(17);
        list.insertInOrder(10);
        list.insertInOrder(1);
        list.insertInOrder(6);
        list.insertInOrder(4);
        list.insertInOrder(9);
        list.print();
        list.printBack();
    }

}
