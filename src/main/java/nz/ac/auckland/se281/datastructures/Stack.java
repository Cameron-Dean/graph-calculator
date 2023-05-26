package nz.ac.auckland.se281.datastructures;

/**
 * A stack where each node is added to the top of the stack and removed from the top of the stack.
 */
public class Stack<T extends Comparable<T>> extends LinkedList<T> {

  /**
   * Adds an element with the specified value to the top of the stack.
   *
   * @param value The value to add to the top of the stack.
   */
  public void push(T value) {
    super.prepend(value);
  }

  /**
   * Removes the element at the top of the stack and returns the value that was stored in that
   * element.
   *
   * @return The value of the element at the top of the stack previously.
   */
  public T pop() {
    Node<T> result = super.head;
    super.remove(0);
    return result.getValue();
  }

  /**
   * Returns the value of the element at the top of the stack currently.
   *
   * @return The value of the element at the top of the stack currently.
   */
  public T peek() {
    return super.head.getValue();
  }
}
