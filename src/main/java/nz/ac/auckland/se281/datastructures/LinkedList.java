package nz.ac.auckland.se281.datastructures;

public class LinkedList<T extends Comparable<T>> {

  protected Node<T> head;
  protected int size;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public void add(T value) {
    throw new UnsupportedOperationException();
  }

  public T get(int index) {
    throw new UnsupportedOperationException();
  }

  public void insert(T value) {
    throw new UnsupportedOperationException();
  }

  public void remove(int index) {
    throw new UnsupportedOperationException();
  }

  public int size() {
    throw new UnsupportedOperationException();
  }

  public boolean isEmpty() {
    throw new UnsupportedOperationException();
  }
}
