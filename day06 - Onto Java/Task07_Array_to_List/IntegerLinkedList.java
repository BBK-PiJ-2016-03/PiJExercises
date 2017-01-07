package Task07_Array_to_List;
/**
 * Created by Alexander Worton on 07/01/2017.
 */
public class IntegerLinkedList {
    private IntegerNode head;
    private IntegerNode tail;
    private int size = 0;

    public void add(int value){
        IntegerNode node = new IntegerNode(value);
        if(getHead() == null){
            addFirstNode(node);
            return;
        }
        addLastNode(node);
    }

    public void removeAt(int index){
        validateIndex(index);
        removeNodeAt(index);
    }

    private void removeNodeAt(int index) {
        IntegerNode before = getNode(index-1);
        IntegerNode node = getNode(index);
        IntegerNode after = getNode(index+1);
        removeNodeBetween(before, node, after);
    }

    private void removeNodeBetween(IntegerNode before, IntegerNode node, IntegerNode after) {
        if(before != null) before.setNext(after);
        if(after != null) before.setPrev(before);
        if(node.equals(getHead())) setHead(after);
        if(node.equals(getTail())) setHead(before);
        decrementSize();
    }

    private void decrementSize() {
        this.size--;
    }

    public void put(int index, IntegerNode node){
        validateIndex(index);
        IntegerNode existing = getNode(index);
        replaceNode(existing, node);
    }

    private void replaceNode(IntegerNode existing, IntegerNode node) {
        node.setPrev(existing.getPrev());
        node.setNext(existing.getNext());
        if(existing.equals(getHead())) setHead(node);
        if(existing.equals(getTail())) setTail(node);
    }

    public void insert(int index, int value){
        IntegerNode node = new IntegerNode(value);
        validateIndex(index);
        IntegerNode before = getNode(index-1);
        IntegerNode after = getNode(index+1);
        insertNodeBetween(before, node, after);
    }

    private void insertNodeBetween(IntegerNode before, IntegerNode node, IntegerNode after) {
        if(before != null) insertNodeAfter(node, before);
        if(after != null) insertNodeBefore(node, after);
        incrementSize();
    }

    private void insertNodeBefore(IntegerNode node, IntegerNode after) {
        after.setPrev(node);
        node.setNext(after);
        if(after.equals(getHead()))
            setHead(node);
    }

    private void insertNodeAfter(IntegerNode node, IntegerNode before) {
        before.setNext(node);
        node.setPrev(before);
        if(before.equals(getTail()))
            setTail(node);
    }

    public int get(int index){
        validateIndex(index);
        return getNode(index).getValue();
    }

    private void addFirstNode(IntegerNode node) {
        setHead(node);
        setTail(node);
        incrementSize();
    }

    private void addLastNode(IntegerNode node) {
        getTail().setNext(node);
        node.setPrev(getTail());
        setTail(node);
        incrementSize();
    }

    private void incrementSize() {
        this.size++;
    }

    private IntegerNode getNode(int index){
        if(index < size()/2)
            return getNodeFromHead(index);
        return getNodeFromTail(index);
    }

    private void validateIndex(int index) {
        if(index >= size() || index < 0)
            throw new IndexOutOfBoundsException(String.format("index %d is out of bounds", index));
    }

    private IntegerNode getNodeFromHead(int index) {
        IntegerNode currentNode = getHead();
        for(int i = 1; i <= index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    private IntegerNode getNodeFromTail(int index) {
        IntegerNode currentNode = getTail();
        for(int i = size()-2; i >= index; i--){
            currentNode = currentNode.getPrev();
        }
        return currentNode;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private IntegerNode getHead() {
        return head;
    }

    private IntegerNode getTail() {
        return tail;
    }

    private void setTail(IntegerNode tail) {
        this.tail = tail;
    }

    private void setHead(IntegerNode head) {
        this.head = head;
    }
}
