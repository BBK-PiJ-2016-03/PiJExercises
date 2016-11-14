public class UserImpl implements User, LibraryUser{

    private String name;
    private Integer libraryID;
    private Library library;

    public UserImpl(String name) {
        this.name = name;
    }

    public int getLibraryID(){
        return (int)this.libraryID;
    }
    
    public String getName(){
        return this.name;
    }

    public void register(Library library){
        this.library = library;
        this.libraryID = library.register(this);
    }

    public Library getLibrary(){
        return this.library;
    }
}