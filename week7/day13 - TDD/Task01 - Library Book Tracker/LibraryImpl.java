import java.util.Hashtable;

public class LibraryImpl implements Library{
    private Hashtable<int, LibraryUser> members = new LinkedList<>();    
    private String libraryName;
    private int maxBooksPerUser = 3;

    public LibraryImpl(String name) {
        this.libraryName = name;
    }

    public int register(LibraryUser user){
        int id = getId(user.getName())

        members.put(id, user);
    }

    public int getId(String name){
        return name.hashCode();
    }

    public String getName(){
        return this.name;
    }

    public void setMaxBooksPerUser(int max){
        if(max < 1)
            max = 1;

        this.maxBooksPerUser = max;
    }

    public int getMaxBooksPerUser(){
        return this.maxBooksPerUser;
    }
}