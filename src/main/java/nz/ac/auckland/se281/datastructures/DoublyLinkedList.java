package nz.ac.auckland.se281.datastructures;

/**
 * A doubly linked list which contains nodes that point to the next node and the previous node in
 * the list.
 */
public class DoublyLinkedList<T extends Comparable<T>> extends List<T> {

  protected DoubleNode<T> head;
  protected DoubleNode<T> tail;

  /** Creates a new doubly linked list. */
  public DoublyLinkedList() {
    super();
    this.head = null;
    this.tail = null;
  }

  @Override
  public void prepend(T value) {
    DoubleNode<T> newNode = new DoubleNode<>(value);

    if (super.size == 0) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.setNext(this.head);
      this.head.setPrev(newNode);
      this.head = newNode;
    }

    super.size++;
  }

  @Override
  public void append(T value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public T get(int index) throws IndexOutOfBoundsException {
    throw new UnsupportedOperationException();
  }

  @Override
  public void insert(int index, T value) throws IndexOutOfBoundsException {
    throw new UnsupportedOperationException();
  }

  @Override
  public void remove(int index) throws IndexOutOfBoundsException {
    throw new UnsupportedOperationException();
  }

  /**
   * Helper function to return the double node at a specified index in the doubly linked list.
   *
   * @param index The position of the wanted node in the doubly linked list.
   * @return The node at the specified index.
   */
  private DoubleNode<T> locateNode(int index) {
    throw new UnsupportedOperationException();
  }
}
