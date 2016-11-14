public class UserImpl implements User{

    private String name;
    private Integer libraryID;

    public UserImpl(String name) {
        this.name = name;
    }

    public int getLibraryID(){
        return (int)this.libraryID;
    }

    public int setLibraryID(int libraryID){
        if(this.libraryID == null)
            this.libraryID = new Integer(libraryID);
    }
    
    public String getName(){
        return this.name;
    }


}