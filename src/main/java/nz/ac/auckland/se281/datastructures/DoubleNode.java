package nz.ac.auckland.se281.datastructures;

/** A node to be generated in doubly linked lists. */
public class DoubleNode<T extends Comparable<T>> extends Node<T> {

  private Node<T> prev;

  /**
   * Creates a new node with pointers to the next and previous nodes.
   *
   * @param value The value to be stored by the new double node initially.
   */
  protected DoubleNode(T value) {
    super(value);
    this.prev = null;
  }

  /**
   * Returns the node that the current node points backwards to.
   *
   * @return The previous node.
   */
  protected Node<T> getPrev() {
    return this.prev;
  }

  /**
   * Sets the current node to point backwards to this previous node.
   *
   * @param prev The node to be set as previous to the current node.
   */
  protected void setPrev(Node<T> prev) {
    this.prev = prev;
  }
}
