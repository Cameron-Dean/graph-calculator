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
    throw new UnsupportedOperationException();
  }

  public T pop() {
    throw new UnsupportedOperationException();
  }

  public T peek() {
    throw new UnsupportedOperationException();
  }
}
