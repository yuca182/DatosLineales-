/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author usuario
 */
public class ColaPrioridad implements PriQueue {

 private int maxSize;
   private long[] queArray;
   private int nItems;

    public ColaPrioridad() {
        maxSize = 0;
      queArray = new long[maxSize];
      nItems = 0;

       
    }



    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insertItem(Object item, int k) {
         int j;
      if(nItems==0) 	// if no items,
         queArray[nItems++] =k;    // inserta en  0
      else                            // si hay items,
         {
         for(j=nItems-1; j>=0; j--)       // por el final
            {
            if( k > queArray[j] )    // si nuevo es mayor,
               queArray[j+1] = queArray[j]; // intercambio
            else                       // si es más pequeño,
               break;               // nada
            }  // end for
         queArray[j+1] = k;     // insertar en posición
         nItems++;
         }  // end else (nItems > 0)
    }

    public void insert(Object item)
    {
        insertItem(item,(Integer)item);
    }



    public Object minEle() throws PriQueueEmptyException {
        return queArray[nItems-1];
    }

    public Object removeMinEle() throws PriQueueEmptyException {
        return queArray[--nItems];
    }

    public int minKey() throws PriQueueEmptyException {
        return (int)queArray[nItems-1];
    }

}
