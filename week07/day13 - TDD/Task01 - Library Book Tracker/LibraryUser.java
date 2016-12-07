public interface LibraryUser{

    /**
     * get the user's name
     * @return String name
     */
    String getName(); 

    /**
     * register the user with a library
     * @param library is the library object to register against
     */
    void register(Library library);

    /**
     * get the library the book is registered to
     * @return String is the name ofthe library object to register against
     */
    String getLibrary(); 

    /**
     * get the user's library ID
     * @return int libraryID
     */
    int getLibraryID();
}