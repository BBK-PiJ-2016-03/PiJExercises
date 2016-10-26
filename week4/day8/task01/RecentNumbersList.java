public class RecentNumbersList implements RecentNumbers{

    private Node<String> firstNode;
    private int max = 0;
    private int count = 0;

    public RecentNumbersList(int max){
        this.max = max;
    }

    @Override
    public void add(String number){
        this.node = new Node(number);
        node.setNextElement();
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
    public String getElementAtIndex(int index){
        if(index >= max)
            throw new IndexOutOfBoundsException();

        return "";
    }

    private Node getNodeAtIndex(int index){
        Node currentNode = firstNode;
        for(int i = 0; i <= index; i++){
            currentNode = currentNode.getNextNode();
        }
    }

}