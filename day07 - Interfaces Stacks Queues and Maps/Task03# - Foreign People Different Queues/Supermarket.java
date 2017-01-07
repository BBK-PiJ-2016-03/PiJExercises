public class Supermarket{

    private PersonQueue queue;

    public static void main(String[] args){
        Supermarket sm = new Supermarket();
    }

    public Supermarket(){
        this.queue = new PersonQueueImpl();

        addPerson(new Person("Bill"));

        servePerson();

        addPerson(new Person("Bob"));
        addPerson(new Person("Bert"));

        servePerson();

        addPerson(new Person("Barry"));
        addPerson(new Person("Bertha"));
        addPerson(new Person("Bilbo"));

        while(this.queue.length() > 0){
            servePerson();
        }


    }

    public void addPerson(Person person){
        this.queue.insert(person);
        System.out.println(person + " has joined the queue");
    }

    public void servePerson(){
        Person servedPerson = this.queue.retrieve();
        System.out.println(servedPerson + " has been served");
    }

}