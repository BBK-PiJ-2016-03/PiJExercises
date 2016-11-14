public interface User{
    /**
     * get the user's library ID
     * @return int libraryID
     */
    int getLibraryID();

    /**
     * set the user's library ID
     * @param int libraryID
     */
    void setLibraryID(int libraryID);

    /**
     * get the user's name
     * @return String name
     */
    String getName();    
}