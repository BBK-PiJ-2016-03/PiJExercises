package Task07_Array_to_List;
/**
 * Created by Alexander Worton on 07/01/2017.
 */
public class IntegerNode {
    private int value;
    private IntegerNode prev;
    private IntegerNode next;

    public IntegerNode(int value){
        setValue(value);
    }

    public int getValue(){
        return this.value;
    }

    private void setValue(int value){
        this.value = value;
    }

    public IntegerNode getPrev() {
        return prev;
    }

    public void setPrev(IntegerNode prev) {
        this.prev = prev;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }
}
