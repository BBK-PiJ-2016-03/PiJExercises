package Task04_1$_Simple_Unfair_Queue;

public class App{
    public static void main(String[] args){

        PersonQueue queue = new UnfairPersonQueue();
        queue.insert(new Person("Bob", 62));
        queue.insert(new Person("Sarah", 45));
        queue.insert(new Person("Quentin", 71));
        queue.insert(new Person("Thomas", 86));

        System.out.println(queue.retrieve());
        System.out.println(queue.retrieve());
        System.out.println(queue.retrieve());
        System.out.println(queue.retrieve());

    }
}