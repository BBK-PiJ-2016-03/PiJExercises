public class MockLibrary implements Library{

    public int register(LibraryUser user){
        return 13;
    }

    public String getName(){
        return "Library name";
    }
}