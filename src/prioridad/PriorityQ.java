/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author LuisPasos
 */
public class PriorityQ {

   // array in sorted order,
   // from max at 0 to min at size-1
   private int maxSize;
   private long[] queArray;
   private int nItems;

//----------------------------------
   public PriorityQ(int s)
      {
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
      }

   public void insert(long item)    // insertar item
      {
      int j;
      if(nItems==0) 	// if no items,
         queArray[nItems++] = item;    // inserta en  0
      else                            // si hay items,
         {
         for(j=nItems-1; j>=0; j--)       // por el final
            {
            if( item > queArray[j] )    // si nuevo es mayor,
               queArray[j+1] = queArray[j]; // intercambio
            else                       // si es más pequeño,
               break;               // nada
            }  // end for
         queArray[j+1] = item;     // insertar en posición
         nItems++;
         }  // end else (nItems > 0)
      }  // end insert()
//-------------------------------------------------------------
 public long remove()             // eliminar el menor valor
      { return queArray[--nItems]; }

public long peekMin()            // obtener el menor valor
      { return queArray[nItems-1]; }


   public boolean isEmpty()
      { return (nItems==0); }

   public boolean isFull()
     { return (nItems == maxSize); }

  // end class PriorityQ

public static void main(String args[]){

    PriorityQ colaP = new PriorityQ(100);
    colaP.insert(89);
    colaP.insert(21);
    colaP.insert(22);
    colaP.insert(5);
    colaP.insert(20);
    System.out.println(colaP.remove());
    System.out.println(colaP.remove());
}

}
