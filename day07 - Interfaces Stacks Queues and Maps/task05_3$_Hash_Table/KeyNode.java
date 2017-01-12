package task05_3$_Hash_Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Worton on 12/01/2017.
 */
public class KeyNode<T> {
    private int key;
    private List<T> values;
    private KeyNode left;
    private KeyNode right;

    {
        values = new ArrayList<>();
    }

    public KeyNode(int key, T value){
        setKey(key);
        addValue(value);
    }

    public int size(){
        return values.size();
    }

    public List<T> getValues() {
        return values;
    }

    public void addValue(T value) {
        this.values.add(value);
    }

    public void removeValue(T value) {
        this.values.remove(value);
    }

    public void setValues(List<T> values) {
        this.values = values;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public KeyNode getLeft() {
        return left;
    }

    public void setLeft(KeyNode left) {
        this.left = left;
    }

    public KeyNode getRight() {
        return right;
    }

    public void setRight(KeyNode right) {
        this.right = right;
    }
}
