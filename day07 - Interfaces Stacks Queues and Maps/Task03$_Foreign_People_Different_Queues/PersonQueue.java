package Task03$_Foreign_People_Different_Queues;

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
