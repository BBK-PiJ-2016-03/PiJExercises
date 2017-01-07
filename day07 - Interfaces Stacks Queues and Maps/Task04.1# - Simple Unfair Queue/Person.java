public class Person {
    private String name;
    private int age;
    private Person prevPerson;
    private Person nextPerson;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.prevPerson = null;
        this.nextPerson = null;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
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