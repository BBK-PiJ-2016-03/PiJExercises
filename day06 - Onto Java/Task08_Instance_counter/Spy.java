package Task08_Instance_counter;

/**
 * Created by Alexander Worton on 07/01/2017.
 */
/*
Complete the example given in the notes with a class called Spy. Your class must have:
• one and only one static variable, and int called spyCount.
• an instance variable of type int for the spy’s ID.
• a constructor method that receives the ID of the spy as an argument, increases spyCount(int) by one, and
prints on the screen the ID of this spy plus the total number of spies so far.
• a die() method that prints on the screen “Spy XX has been detected and eliminated” (where XX is the spy’s
ID), decrements the spy counter and prints on the screen the total number of spies so far.
• a main method in which several objects of class Spy are created and some of them killed (their method die()
is called).
Observe how the static variable is accessed by different objects both to increment and to decrement it.
 */
public class Spy {
    private static int spyCount = 0;
    private int id;
    private Boolean alive;

    {
        alive = true;
    }

    public Spy(int id) {
        incrementSpyCount();
        setId(id);
        printIdAndCount();
    }

    private int getSpyCount() {
        return this.spyCount;
    }

    private void printIdAndCount() {
        System.out.println(String.format("This spy is %d, 1 of %d spies", getId(), getSpyCount()));
    }

    private void incrementSpyCount() {
        this.spyCount++;
    }

    private void decrementSpyCount() {
        this.spyCount--;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void die(){
        if(alive) {
            alive = false;
            decrementSpyCount();
            System.out.println(String.format("Spy %d has been detected and eliminated. %d spies remaining", getId(), getSpyCount()));
        }
    }
}