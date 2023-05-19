package nz.ac.auckland.se281.datastructures;

/**
 * An edge in a graph that connects two verticies.
 *
 * <p>You must NOT change the signature of the constructor of this class.
 *
 * @param <T> The type of each vertex.
 */
public class Edge<T> {

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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((source == null) ? 0 : source.hashCode());
    result = prime * result + ((destination == null) ? 0 : destination.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Edge<T> other = (Edge<T>) obj;
    if (source == null) {
      if (other.source != null) return false;
    } else if (!source.equals(other.source)) return false;
    if (destination == null) {
      if (other.destination != null) return false;
    } else if (!destination.equals(other.destination)) return false;
    return true;
  }
}
