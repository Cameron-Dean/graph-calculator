package nz.ac.auckland.se281.datastructures;

/** List class for linked list and doubly linked list to extend. */
public abstract class MyList<T extends Comparable<T>> {

  protected int size;

  /** Creates a new list. */
  protected MyList() {
    this.size = 0;
  }

  /**
   * Adds a new node with a specified value to the beginning of the list.
   *
   * @param value The value to be stored at the beginning of the list.
   */
  public abstract void prepend(T value);

  /**
   * Adds a new node with a specified value to the end of the list.
   *
   * @param value The value to be stored at the end of the list.
   */
  public abstract void append(T value);

  /**
   * Returns the value at a specified index in the linked list.
   *
   * @param index The position of the element in the linked list.
   * @return The value at the specified index.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
  public abstract T get(int index) throws IndexOutOfBoundsException;

  /**
   * Inserts an element into the linked list at the specified index with the specified value.
   *
   * @param index The position at which the element will be in the linked list.
   * @param value The value that will be stored.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
  public abstract void insert(int index, T value) throws IndexOutOfBoundsException;

  /**
   * Removes the element at the specified index in the linked list.
   *
   * @param index The position in the linked list to remove the element.
   * @throws IndexOutOfBoundsException The specified index does not exist within the linked list.
   */
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
