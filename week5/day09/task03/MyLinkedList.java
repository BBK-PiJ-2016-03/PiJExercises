public interface MyLinkedList<T>{
    /**
    * Add a new value to the list
    * @param number is the number to be added
    */
    void add(T value);

    /**
    * Remove first occurence of a value from the list
    */
    void remove(T value);

    /**
    * @return the current length of the list
    */
    int length();

    /**
    * @return the value at the index
    */
    T getElementAt(int index);
}