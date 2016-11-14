public class BookImpl implements Book{

    private String title;
    private String author;    

    public name(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

}