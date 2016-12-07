public class PersonQueueImpl implements PersonQueue {
    private Person entryPoint = null;

    public boolean isEmpty() {
        return (entryPoint == null);
    }

    private boolean hasOneElement() {
        if ((!isEmpty()) && (entryPoint.next == null)) {
            return true;
        }
        return false;
    }

    public void insert(Person person) {
        if (isEmpty()) {
            entryPoint = person;
            return null;
        }

        person.next = entryPoint;
        entryPoint = person;
    }

    public Person retrieve() {
        if (isEmpty()) {
            System.out.println("ERROR! There is nothing to retrieve!");
            return null;
        }

        if (hasOneElement()) {
            Person result = entryPoint;
            entryPoint = null;
            return result;
        }

        Person current = entryPoint;
        while (current.next.next != null) {
            current = current.next;
        }

        Person result = current.next;
        current.next = null;
        return result;
    }
}