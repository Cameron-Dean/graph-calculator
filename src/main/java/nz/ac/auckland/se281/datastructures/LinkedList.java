package nz.ac.auckland.se281.datastructures;

/** A singly linked list containing nodes which point forwards to the next node. */
public class LinkedList<T extends Comparable<T>> extends Node<T> {

  protected Node<T> head;
  protected int size;

  /** Creates a new singly linked list. */
  public LinkedList() {
    super();
    this.head = null;
    this.size = 0;
  }

  /**
   * Adds a new node with a specified value to the end of the list.
   *
   * @param value The value to be stored at the end of the list.
   */
  public void append(T value) {
    Node<T> newNode = new Node<>(value);

    if (this.size == 0) {
      this.head = newNode;
    } else {
      Node<T> temp = this.head;

      while (temp.getNext() != null) {
        temp = temp.getNext();
      }

      temp.setNext(newNode);
    }

    this.size++;
  }

  public T get(int index) {
    throw new UnsupportedOperationException();
  }

  public void insert(int index, T value) {
    throw new UnsupportedOperationException();
  }

  public void remove(int index) {
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the number of elements in the linked list.
   *
   * @return The size of the linked list.
   */
  public int size() {
    return this.size;
  }

  /**
   * Returns true if the linked list does not contain any elements.
   *
   * @return True if the linked list is empty.
   */
  public boolean isEmpty() {
    return this.size == 0;
  }
}
