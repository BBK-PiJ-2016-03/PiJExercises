package task05_3$_Hash_Table;

/**
 * Created by Alexander Worton on 12/01/2017.
 */
public class SimpleMapImpl implements SimpleMap{

    private KeyNode<String> rootNode;
    private int size;

    {
        size = 0;
    }

    @Override
    public String put(int key, String name) {
        if(rootNode == null) {
            setRootNode(new KeyNode(key, name));
            return name;
        }
        placeNode(key, name);
        return name;
    }

    private void placeNode(int key, String name) {
        KeyNode<String> existingNode = getNode(key);
        if(existingNode != null){
            existingNode.addValue(name);
            return;
        }



    }

    private KeyNode<String> getNode(int key, KeyNode<String> currentNode) {
        if(currentNode.getKey() == key)
            return currentNode;

        if(currentNode.getLeft() == null && currentNode.getRight() == null)
            return null;

        if(currentNode.getKey() < key)
            return getNode(key, currentNode.getLeft());

        return getNode(key, currentNode.getRight());
    }

    //test and refactor
    private void putNode(int key, KeyNode<String> newNode, KeyNode<String> currentNode) {

        if(currentNode.getKey() == key)
            return;

        if(newNode.getKey() < currentNode.getKey()){
            if(currentNode.getLeft() == null){
                currentNode.setLeft(newNode);
                return;
            }

            if(currentNode.getLeft().getKey() < newNode.getKey()){
                newNode.setLeft(currentNode.getLeft());
                currentNode.setLeft(newNode);
                return;
            }

            putNode(key, newNode, currentNode.getLeft());
            return;
        }

        if(currentNode.getRight() == null){
            currentNode.setRight(newNode);
            return;
        }
        putNode(key, newNode, currentNode.getRight());

    }

    @Override
    public String[] get(int key) {
        return new String[0];
    }

    @Override
    public void remove(int key, String name) {

    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }

    private int getSize() {
        return this.size;
    }

    private void setRootNode(KeyNode rootNode) {
        this.rootNode = rootNode;
    }
}
