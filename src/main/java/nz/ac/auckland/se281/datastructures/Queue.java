package nz.ac.auckland.se281.datastructures;

/**
 * A queue where each node is added to the end of the queue and removed from the front of the queue.
 */
public class Queue<T extends Comparable<T>> extends DoublyLinkedList<T> {

  public void enqueue(T value) {
    throw new UnsupportedOperationException();
  }

  public T dequeue() {
    throw new UnsupportedOperationException();
  }

  public T peek() {
    throw new UnsupportedOperationException();
  }
}
