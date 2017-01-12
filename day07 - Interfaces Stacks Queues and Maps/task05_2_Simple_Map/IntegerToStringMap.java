package task05_2_Simple_Map;

public class IntegerToStringMap implements SimpleMap{

    private int countOfElements = 0;
    private String[] map = new String[1000];

    /**
    * Puts a new String in the map.
    *
    * If the key is already in the map, nothing is done.
    */
    public void put(int key, String name){
        map[HashUtilities.shortHash(key)] = name;
        countOfElements++;
    }
    /**
    * Returns the name associated with that key,
    * or null if there is none.
    */
    public String get(int key){
        return map[HashUtilities.shortHash(key)];
    }
    /**
    * Removes a name from the map. Future calls to get(key)
    * will return null for this key unless another
    * name is added with the same key. 2
    */
    public void remove(int key){
        map[HashUtilities.shortHash(key)] = null;
        countOfElements--;
    }

    public boolean isEmpty(){
        return countOfElements > 0 ? false : true;
    }
}