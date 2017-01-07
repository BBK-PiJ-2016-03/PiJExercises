public class Person{
    private String fName;
    private String sName;

    public Person(String fName, String sName){
        this.fName = fName;
        this.sName = sName;
    }

    @Override
    public String toString(){
        return this.fName + " " + this.sName;
    }
}