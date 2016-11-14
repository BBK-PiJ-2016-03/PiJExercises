public class UserImpl implements User{

    private String name;
    private Integer libraryID;

    public UserImpl(String name) {
        this.name = name;
    }

    public int getLibraryID(){
        return (int)this.libraryID;
    }
    
    public String getName(){
        return this.name;
    }
}