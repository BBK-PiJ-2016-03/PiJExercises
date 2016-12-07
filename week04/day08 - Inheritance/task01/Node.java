public class Node<T>{

    private T value = null;
    private Node<T> nextNode;
    private Node<T> prevNode;

    /**
    * constructor fornode
    * @param T value takes the value to be stored in the node and writes this to the class variable
    */
    public Node(T value){
        this.value = value;
    }

    /**
    * getter for value
    * @return value stored in the node
    */
    public T getValue(){
        return this.value;
    }

    /**
    * getter for the next linked node
    * @return Node reference for the next node in the sequence
    */
    public Node<T> getNextNode(){
        return this.nextNode;
    }

    /**
    * getter for the previous linked node
    * @return Node reference for the previous node in the sequence
    */
    public Node<T> getPrevNode(){
        return this.prevNode;
    }

    /**
    * setter for the next linked node
    * @param nextNode reference for the next node to be connected to the sequence
    */
    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    /**
    * setter for the previous linked node
    * @param prevNode reference for the next node to be connected to the sequence
    */
    public void setPrevNode(Node<T> prevNode){
        this.prevNode = prevNode;
    }
}