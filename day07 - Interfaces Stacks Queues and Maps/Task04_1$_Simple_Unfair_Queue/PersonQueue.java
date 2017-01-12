package Task04_1$_Simple_Unfair_Queue;

public interface PersonQueue {
/**
* Adds another person to the queue.
*/
void insert(Person person);
/**
* Removes a person from the queue.
*/
Person retrieve();
}