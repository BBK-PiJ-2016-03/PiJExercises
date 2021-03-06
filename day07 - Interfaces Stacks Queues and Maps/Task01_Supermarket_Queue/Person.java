package Task01_Supermarket_Queue;

public class Person {
    private String name;
    private Person prevPerson;
    private Person nextPerson;

    public Person(String name) {
        this.name = name;
        this.prevPerson = null;
        this.nextPerson = null;
    }

    public String getName() {
        return this.name;
    }

    public Person getPrevPerson() {
        return this.prevPerson;
    }

    public Person getNextPerson() {
        return this.nextPerson;
    }

    public void setPrevPerson(Person person) {
        this.prevPerson = person;
    }

    public void setNextPerson(Person person) {
        this.nextPerson = person;
    }

    @Override
    public String toString(){
        return this.name;
    }

}