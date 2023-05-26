package nz.ac.auckland.se281.datastructures;

/**
 * A stack where each node is added to the top of the stack and removed from the top of the stack.
 */
public class Stack<T extends Comparable<T>> extends LinkedList<T> {

  /** Creates a new stack. */
  public Stack() {
    super();
  }

  public void push(T value) {
    super.prepend(value);
  }

  public T pop() {
    Node<T> result = super.head;
    super.remove(0);
    return result.getValue();
  }

  public T peek() {
    return super.head.getValue();
  }
}
