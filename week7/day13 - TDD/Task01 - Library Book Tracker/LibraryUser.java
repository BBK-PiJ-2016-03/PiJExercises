public interface LibraryUser{
    /**
     * register the book with a library
     * @param library is the library object to register against
     */
    register(Library library);

    /**
     * get the libray the book is registered to
     * @return library is the library object to register against
     */
    Library getLibrary();
}