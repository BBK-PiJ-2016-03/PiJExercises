public class LibraryImpl implements Library{

    private String name;
    private int maxBooksPerUser = 3;

    public LibraryImpl(String name) {
        this.name = name;
    }

    public int register(LibraryUser user){
        return 13;
    }

    public String getName(){
        return this.name;
    }

    public int setMaxBooksPerUser(int max){
        if(max < 1)
            max = 1;

        this.maxBooksPerUser = max;
    }

    public int getMaxBooksPerUser(){
        return 5;
    }
}