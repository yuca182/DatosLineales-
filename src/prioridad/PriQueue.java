/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author usuario
 */
public interface PriQueue {

    public int size();
    public boolean isEmpty();
    public void insertItem(Object item,int k);
    public Object minEle() throws PriQueueEmptyException;
    public Object removeMinEle () throws PriQueueEmptyException;

    public int minKey() throws PriQueueEmptyException;

}
