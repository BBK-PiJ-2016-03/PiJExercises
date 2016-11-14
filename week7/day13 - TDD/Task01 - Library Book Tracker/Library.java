public interface Library{
    /**
     * take a user and register them in the Library.
     * @param User user registered with the library 
     * @return int the userID for the Library
     */
    int register(LibraryUser user);

    /**
     * get the library's name
     * @return String name
     */
    String getName();

    /**
     * set the maximum number of books that can be loaned per person
     * @param int max set maximum number of borrowable books
     */
    int setMaxBooksPerUser(int max);

    /**
     * get the maximum number of books that can be loaned per person
     * @return int max number of borrowable books
     */
    int getMaxBooksPerUser();
}