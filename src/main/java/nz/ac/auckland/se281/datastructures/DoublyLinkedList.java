package nz.ac.auckland.se281.datastructures;

public class DoublyLinkedList<T extends Comparable<T>> extends List<T> {

  protected DoubleNode<T> head;
  protected DoubleNode<T> tail;

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

  private DoubleNode<T> locateNode(int index) {
    throw new UnsupportedOperationException();
  }
}
