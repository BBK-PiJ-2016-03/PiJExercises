package Task02$_Supermarket_queue_revisited;

public class SupermarketQueue implements PersonQueue {

    private Person firstPerson = null;
    private int length = 0;

    public SupermarketQueue(){

    }

    public SupermarketQueue(Person person){
        insert(person);
    }

    public void insert(Person person) {
        if(firstPerson == null){
            firstPerson = person;
            this.length++;
            return;
        }

        person.setNextPerson(firstPerson);
        firstPerson = person;
         this.length++;
    }

    public Person retrieve() {
        if (firstPerson == null){
            return null;
        }

        if (firstPerson.getNextPerson() == null) {
            Person lastPerson = firstPerson;
            firstPerson = null;
            lastPerson.setNextPerson(null);
            this.length--;
            return lastPerson;
        }

        Person currentPerson = firstPerson;
        while (currentPerson.getNextPerson() != null) {
            if (currentPerson.getNextPerson().getNextPerson() == null)
                break;
            currentPerson = currentPerson.getNextPerson();
        }

        Person lastPerson = currentPerson.getNextPerson();
        currentPerson.setNextPerson(null);
        this.length--;
        return lastPerson;

    }

    public int length(){
        return this.length;
    }


}