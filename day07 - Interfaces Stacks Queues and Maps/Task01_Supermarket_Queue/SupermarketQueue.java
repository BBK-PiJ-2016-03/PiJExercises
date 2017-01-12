package Task01_Supermarket_Queue;

public class SupermarketQueue implements PersonQueue {

    private Person firstPerson = null;
    private Person lastPerson = null;
    private int length = 0;

    public SupermarketQueue(){

    }

    public SupermarketQueue(Person person){
        insert(person);
    }

    @Override
    public void insert(Person person) {
        if(firstPerson == null){
            firstPerson = person;
            lastPerson = person;
            this.length++;
            return;
        }

        person.setNextPerson(firstPerson);
        firstPerson.setPrevPerson(person);
        firstPerson = person;
         this.length++;
    }

    public Person retrieve() {

        Person removedPerson = lastPerson;

        if(lastPerson == null)
            return null;

        if(lastPerson == firstPerson){
            lastPerson.setNextPerson(null);
            lastPerson.setPrevPerson(null);
            firstPerson = null;
            lastPerson = null;
            this.length--;
            return removedPerson;
        }

        lastPerson = lastPerson.getPrevPerson();
        lastPerson.setNextPerson(null);

        removedPerson.setPrevPerson(null);
        removedPerson.setNextPerson(null);

        this.length--;
        return removedPerson;
    }

    public Person peek(){
        return lastPerson;
    }

    public int length(){
        return this.length;
    }


}