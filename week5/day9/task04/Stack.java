public interface Stack<T>{
    /**
    * @return and remove the most recent value from the stack
    */
    T pop();

    /**
    * @return the preview of the most recent value on the stack
    */
    T peek();

    /**
    * @return a boolean to indicate if the stack is empty
    */
    boolean isEmpty();

    /**
    * @param insert the element on to the stack
    */
    void push(T element);
}