package nz.ac.auckland.se281.datastructures;

/**
 * A queue where each node is added to the end of the queue and removed from the front of the queue.
 */
public class Queue<T extends Comparable<T>> extends DoublyLinkedList<T> {

  /**
   * Adds an element to the end of the queue which stores the value specified.
   *
   * @param value The value to be stored at the end of the queue.
   */
  public void enqueue(T value) {
    super.append(value);
  }

  /**
   * Returns the value at the front of the queue and removes that element from the queue.
   *
   * @return The value at the front of the queue.
   */
  public T dequeue() {
    DoubleNode<T> result = super.head;
    super.remove(0);
    return result.getValue();
  }

  /**
   * Returns the value at the front of the queue.
   *
   * @return The value at the front of the queue.
   */
  public T peek() {
    return super.head.getValue();
  }
}
