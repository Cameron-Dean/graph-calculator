package nz.ac.auckland.se281.datastructures;

public abstract class List<T extends Comparable<T>> {

  protected int size;

  protected List() {
    this.size = 0;
  }

  public abstract void prepend(T value);

  public abstract void append(T value);

  public abstract T get(int index) throws IndexOutOfBoundsException;

  public abstract void insert(int index, T value) throws IndexOutOfBoundsException;

  public abstract void remove(int index) throws IndexOutOfBoundsException;

  /**
   * Returns the number of elements in the list.
   *
   * @return The size of the list.
   */
  public int size() {
    return this.size;
  }

  /**
   * Returns true if the linked list does not contain any elements.
   *
   * @return True if the list is empty.
   */
  public boolean isEmpty() {
    return this.size == 0;
  }
}
