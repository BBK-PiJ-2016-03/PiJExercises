public class LibraryImpl implements Library{

    private String name;

    public LibraryImpl(String name) {
        this.name = name;
    }

    public int register(LibraryUser user){
        return 13;
    }

    public String getName(){
        return this.name;
    }
}