package nz.ac.auckland.se281.datastructures;

/** A node to be generated in linked lists. */
public class Node<T extends Comparable<T>> {

  private T value;
  private Node<T> next;

  /** Empty constructor for children classes. */
  protected Node() {}

  /**
   * Creates a new node.
   *
   * @param value The value to be stored by the new node initially.
   */
  protected Node(T value) {
    this.value = value;
    this.next = null;
  }

  /**
   * Returns the value associated with the current node.
   *
   * @return The node's value.
   */
  protected T getValue() {
    return this.value;
  }

  /**
   * Sets the value within the current node.
   *
   * @param value The value to be set for the node.
   */
  protected void setValue(T value) {
    this.value = value;
  }

  /**
   * Returns the node that the current node points forward to.
   *
   * @return The next node.
   */
  protected Node<T> getNext() {
    return this.next;
  }

  /**
   * Sets the current node to point towards this next node.
   *
   * @param next The node to be pointed to by the current node.
   */
  protected void setNext(Node<T> next) {
    this.next = next;
  }
}
