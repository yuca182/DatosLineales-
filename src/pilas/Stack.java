/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

/**
 *
 * @author josue
 */
public interface Stack {
    
    public int size();
    public boolean isEmpty();
    public void push(Object o);
    public Object pop() throws StackEmptyException;
    public Object top() throws StackEmptyException;

}
