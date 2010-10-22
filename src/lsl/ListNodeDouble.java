/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsl;

/**
 *
 * @author Huallo
 */
public class ListNodeDouble extends ListNode {

    public ListNodeDouble beforeNode;

    ListNodeDouble(Object object){
        super(object);
        beforeNode=null;
    }

    ListNodeDouble(Object object,ListNodeDouble before,ListNodeDouble next){
        super(object,next);
        beforeNode=before;
    }

    /**
     * @return the beforeNode
     */
    public ListNodeDouble getBeforeNode() {
        return beforeNode;
    }

    /**
     * @param beforeNode the beforeNode to set
     */
    public void setBeforeNode(ListNodeDouble beforeNode) {
        this.beforeNode = beforeNode;
    }

}
