package nz.ac.auckland.se281.datastructures;

/** A singly linked list containing nodes which point forwards to the next node. */
public class LinkedList<T extends Comparable<T>> extends List<T> {

  private Node<T> head;

  /** Creates a new singly linked list. */
  public LinkedList() {
    super();
    this.head = null;
  }

  /**
   * Adds a new node with a specified value to the beginning of the list.
   *
   * @param value The value to be stored at the beginning of the list.
   */
  public void prepend(T value) {
    Node<T> newNode = new Node<>(value);

    if (super.size == 0) {
      this.head = newNode;
    } else {
      // add node and update head
      newNode.setNext(this.head);
      this.head = newNode;
    }

    super.size++;
  }

  /**
   * Adds a new node with a specified value to the end of the list.
   *
   * @param value The value to be stored at the end of the list.
   */
  public void append(T value) {
    Node<T> newNode = new Node<>(value);

    if (super.size == 0) {
      this.head = newNode;
    } else {
      // find current last node and add pointer to new node
      Node<T> prev = locateNode(super.size - 1);
      prev.setNext(newNode);
    }

    super.size++;
  }

  /**
   * Returns the value at a specified index in the linked list.
   *
   * @param index The position of the element in the linked list.
   * @return The value at the specified index.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
  public T get(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= super.size) {
      throw new IndexOutOfBoundsException(index);
    }

    Node<T> result = this.head;

    for (int i = 0; i < index; i++) {
      result = result.getNext();
    }

    return result.getValue();
  }

  /**
   * Inserts an element into the linked list at the specified index with the specified value.
   *
   * @param index The position at which the element will be in the linked list.
   * @param value The value that will be stored.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
  public void insert(int index, T value) throws IndexOutOfBoundsException {
    if (index < 0 || index > super.size) {
      throw new IndexOutOfBoundsException(index);
    }

    if (index == 0) {
      prepend(value);
      return;
    }

    if (index == super.size) {
      append(value);
      return;
    }

    Node<T> prev = locateNode(index - 1);
    Node<T> newNode = new Node<>(value);

    // shuffle node pointers
    newNode.setNext(prev.getNext());
    prev.setNext(newNode);
    super.size++;
  }

  /**
   * Removes the element at the specified index in the linked list.
   *
   * @param index The position in the linked list to remove the element.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
  public void remove(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= super.size) {
      throw new IndexOutOfBoundsException(index);
    }

    if (index == 0) {
      this.head = this.head.getNext();
      return;
    }

    Node<T> prev = locateNode(index - 1);

    // set pointer to next node's next node to remove the pointer to the node at the index
    prev.setNext(prev.getNext().getNext());
    super.size--;
  }

  /**
   * Helper function to return the node at a specified index in the linked list.
   *
   * @param index The position of the wanted node in the linked list.
   * @return The node at the specified index.
   */
  private Node<T> locateNode(int index) {
    Node<T> result = this.head;

    for (int i = 0; i < index; i++) {
      result = result.getNext();
    }

    return result;
  }
}
