package nz.ac.auckland.se281.datastructures;

public class DoublyLinkedList<T extends Comparable<T>> extends LinkedList<T> {

  protected Node<T> tail;

  public DoublyLinkedList() {
    super();
    this.tail = null;
  }

  @Override
  public void prepend(T value) {
    throw new UnsupportedOperationException();
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

  @Override
  protected Node<T> locateNode(int index) {
    throw new UnsupportedOperationException();
  }
}
