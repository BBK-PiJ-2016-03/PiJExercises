public interface RecentNumbers{
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
    * @return the element at the index
    */
    String getElementAtIndex(int index);
}