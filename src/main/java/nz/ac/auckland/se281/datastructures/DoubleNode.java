package nz.ac.auckland.se281.datastructures;

/** A node to be generated in doubly linked lists. */
public class DoubleNode<T extends Comparable<T>> {

  private T value;
  private DoubleNode<T> next;
  private DoubleNode<T> prev;

  /**
   * Creates a new node with pointers to the next and previous nodes.
   *
   * @param value The value to be stored by the new double node initially.
   */
  protected DoubleNode(T value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }

  /**
   * Returns the value associated with the current double node.
   *
   * @return The double node's value.
   */
  protected T getValue() {
    return this.value;
  }

  /**
   * Sets the value within the current double node.
   *
   * @param value The value to be set for the double node.
   */
  protected void setValue(T value) {
    this.value = value;
  }

  /**
   * Returns the node that the current double node points backwards to.
   *
   * @return The previous double node.
   */
  protected DoubleNode<T> getPrev() {
    return this.prev;
  }

  /**
   * Returns the node that the current double node points forward to.
   *
   * @return The next double node.
   */
  protected DoubleNode<T> getNext() {
    return this.next;
  }

  /**
   * Sets the current double node to point towards this next double node.
   *
   * @param next The double node to be pointed to by the current double node.
   */
  protected void setNext(DoubleNode<T> next) {
    this.next = next;
  }

  /**
   * Sets the current node to point backwards to this previous double node.
   *
   * @param prev The double node to be set as previous to the current double node.
   */
  protected void setPrev(DoubleNode<T> prev) {
    this.prev = prev;
  }
}
