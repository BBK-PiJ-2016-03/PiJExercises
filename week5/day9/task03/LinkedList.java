public interface LinkedList{
    /**
    * Add a new number to the list
    * @param number is the number to be added
    */
    void add(String number);

    /**
    * @return the current length of the list
    */
    int length();

    /**
    * @return the maximum length of the list
    */
    int maxLength();

    /**
    * @return the number at the index
    */
    String getNumber(int index);
}