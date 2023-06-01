package nz.ac.auckland.se281.datastructures;

/**
 * An edge in a graph that connects two vertices.
 *
 * <p>You must NOT change the signature of the constructor of this class.
 *
 * @param <T> The type of each vertex.
 */
public class Edge<T extends Comparable<T>> implements Comparable<T> {

  private T source;
  private T destination;

  /**
   * Creates a new Edge.
   *
   * @param source Vertex edge originates from.
   * @param destination Vertex edge points to.
   */
  public Edge(T source, T destination) {
    this.source = source;
    this.destination = destination;
  }

  /**
   * Returns the source vertex of the current edge.
   *
   * @return The vertex the edge originates from.
   */
  public T getSource() {
    return this.source;
  }

  /**
   * Returns the destination vertex of the current edge.
   *
   * @return The vertex the edge points to.
   */
  public T getDestination() {
    return this.destination;
  }

  @Override
  public int compareTo(T o) {
    if (o instanceof Edge) {
      @SuppressWarnings("unchecked")
      Edge<T> edge = (Edge<T>) o;

      if (Integer.parseInt(edge.getDestination().toString())
          == Integer.parseInt((String) this.destination)) {
        return Integer.parseInt((String) this.source)
            - Integer.parseInt(edge.getSource().toString());
      }
      return Integer.parseInt((String) this.destination)
          - Integer.parseInt(edge.getDestination().toString());
    }

    throw new UnsupportedOperationException("Vertices in graph must be integers, obviously.");
  }
}
