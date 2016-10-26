public class RecentNumbersList implements RecentNumbers{

    private Node<String> firstNode = null;
    private int max = 0;
    private int count = 0;

    public RecentNumbersList(int max){
        this.max = max;
    }

    @Override
    public void add(String number){
        Node<String> newNode = new Node<>(number);
        newNode.setNextNode(this.firstNode);

        this.firstNode = newNode;
        this.count++;

        if(this.count > this.max){
            removeLastNode();
        }
    }

    @Override
    public int length(){
        return count;
    }

    @Override
    public int maxLength(){
        return max;
    }

    @Override
    public String getNumber(int index){
        if(index >= max)
            throw new IndexOutOfBoundsException();

        Node<String> selectedNode = getNode(index);

        if(selectedNode != null)
            return selectedNode.getValue();

        return null;
    }

    /**
    * retrieve the node at a specified index in the collection
    * @return the last node stored in the collection
    */
    private Node<String> getLastNode(){
        return getNode(count - 1);
    }

    /**
    * remove the node at a specified index in the collection
    */
    private void removeLastNode(){
        Node<String> penultimateNode = getNode(count -2);
        penultimateNode.setNextNode(null);
        count--;
    }

    /**
    * retrieve the node at a specified index in the collection
    * @param index is the index position at which to retrieve the Node
    */
    private Node<String> getNode(int index){
        Node<String> currentNode = firstNode;
        for(int i = 1; i <= index; i++){
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

}