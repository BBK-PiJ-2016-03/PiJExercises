public interface LibraryUser{
    /**
     * register the user with a library
     * @param library is the library object to register against
     */
    void register(Library library);

    /**
     * get the libray the book is registered to
     * @return library is the library object to register against
     */
    Library getLibrary();
}