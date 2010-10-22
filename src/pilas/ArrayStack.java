/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

/**
 *
 * @author josue
 */
public class ArrayStack {

    public static final int CAP=1000;
private int capacity;
private Object S[];
private int top=-1;
public ArrayStack() { this(CAP); }
public ArrayStack(int cap) {
capacity=cap;
S=new Object[capacity];
    }

public int size() {
return (top+1);
}
public boolean isEmpty() {
return (top<0);
}
public Object top() throws StackEmptyException {
if (isEmpty())
throw new StackEmptyException("vacio");
return S[top];
}

public void push(Object o)
{
if (size()<capacity)
S[++top]=o;
}
public Object pop() throws StackEmptyException {
Object el;
if (isEmpty())
throw new StackEmptyException("vacio");
el=S[top];
S[top--]=null;
return el;
}
}
