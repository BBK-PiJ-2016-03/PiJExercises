public class SupermarketQueue implements PersonQueue {

    private Person firstPerson = null;
    private Person lastPerson = null;

    public SupermarketQueue(){

    }

    public SupermarketQueue(Person person){
        insert(person);
    }

    public void insert(Person person) {
        if(firstPerson == null){
            firstPerson = person;
            lastPerson = person;
            return;
        }

        person.setNextPerson(firstPerson);
        firstPerson.setPrevPerson(person);
        firstPerson = person;
    }

    public Person retrieve() {

        Person removedPerson = lastPerson;

        if(lastPerson == null)
            return null;

        if(lastPerson == firstPerson){
            lastPerson.setNextPerson = null;
            lastPerson.setPrevPerson = null;
            firstPerson = null;
            lastPerson = null;
            return removedPerson;
        }

        lastPerson = lastPerson.getPrevPerson();
        lastPerson.setNextPerson(null);

        removedPerson.setPrevPerson(null);
        removedPerson.setNextPerson(null);

        return removedPerson;
    }

    public Person peek(){
        return lastPerson;
    }

}