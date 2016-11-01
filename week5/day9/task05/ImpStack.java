public class ImpStack<T> implements GenericStack<T>{

    private Node<T> firstNode = null;
    private int length = 0;

    public T pop(){

        if(this.length == 0)
            return null;

        Node<T> node = this.firstNode;
        this.firstNode = this.firstNode.getNextNode();
        this.length--;

        return node.getValue();
    }

    public T peek(){
        return firstNode.getValue();
    }

    public boolean isEmpty(){
        return this.length == 0 ? true : false;
    }

    public void push(T element){

        Node<T> node = new Node<>(element);

        if(this.firstNode != null)
            node.setNextNode(firstNode);

        this.firstNode = node;

        this.length++;
    }

}