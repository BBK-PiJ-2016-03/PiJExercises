public interface IntSet{
    /**
     * adds a new int to the set; if it is there already, nothing happens.
     * @param newValue is the int to be added to the set
     */

    void add(int newValue);

    /**
     * returns true if the number is in the set, false otherwise.
     * @param value is the integer to check for existence within the collection
     * @return boolean to indicate if the value exists
     */
    boolean contains(int value); 

    /**
     * returns the same values as the former method, but for every element that is checked prints its value on screen.
     * @param value is the integer to check for existance within the collection 
     * @return boolean to indicate if the value exists
     */
    boolean containsVerbose(int value);

    /**
     * Override the toString method     * 
     * @return String to represent the set as a string
     */
    String toString();
}