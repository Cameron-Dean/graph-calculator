package nz.ac.auckland.se281.datastructures;

/** A singly linked list containing nodes which point forwards to the next node. */
public class LinkedList<T extends Comparable<T>> extends MyList<T> {

  protected Node<T> head;

  /** Creates a new singly linked list. */
  public LinkedList() {
    super();
    this.head = null;
  }

  @Override
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

  @Override
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

  @Override
  public T get(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= super.size) {
      throw new IndexOutOfBoundsException(index);
    }

    Node<T> result = this.head;

    // get to the node at the index specified
    for (int i = 0; i < index; i++) {
      result = result.getNext();
    }

    return result.getValue();
  }

  @Override
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

  @Override
  public void remove(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= super.size) {
      throw new IndexOutOfBoundsException(index);
    }

    if (index == 0) {
      this.head = this.head.getNext();
    } else {
      Node<T> prev = locateNode(index - 1);

      // set pointer to next node's next node to remove the pointer to the node at the index
      prev.setNext(prev.getNext().getNext());
    }

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
