package nz.ac.auckland.se281.datastructures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A graph that is composed of a set of vertices and edges.
 *
 * <p>You must NOT change the signature of the existing methods or constructor of this class.
 *
 * @param <T> The type of each vertex, that have a total ordering.
 */
public class Graph<T extends Comparable<T>> {

  private Set<T> vertices;
  private Set<Edge<T>> edges;

  /**
   * Creates a new graph.
   *
   * @param vertices The set of vertices in the graph.
   * @param edges The set of edges in the graph.
   */
  public Graph(Set<T> vertices, Set<Edge<T>> edges) {
    this.vertices = vertices;
    this.edges = edges;
  }

  /**
   * Returns a set of the vertices in the graph that have either degree 0 or self loops.
   *
   * @return Root vertices of the graph.
   */
  public Set<T> getRoots() {
    Set<T> roots = new HashSet<>(vertices);

    for (Edge<T> edge : edges) {
      if (!edge.getDestination().equals(edge.getSource())) {
        roots.remove(edge.getDestination());
      }
    }

    return roots;
  }

  /**
   * Returns true if every vertex in the graph has a self-loop.
   *
   * @return True if the graph is reflexive.
   */
  public boolean isReflexive() {
    Set<T> nonReflexiveVertices = new HashSet<>(vertices);

    for (Edge<T> edge : edges) {
      if (edge.getSource().equals(edge.getDestination())) {
        nonReflexiveVertices.remove(edge.getSource());
      }
    }

    return nonReflexiveVertices.isEmpty();
  }

  public boolean isSymmetric() {
    // TODO: Task 1.
    throw new UnsupportedOperationException();
  }

  public boolean isTransitive() {
    // TODO: Task 1.
    throw new UnsupportedOperationException();
  }

  public boolean isAntiSymmetric() {
    // TODO: Task 1.
    throw new UnsupportedOperationException();
  }

  public boolean isEquivalence() {
    // TODO: Task 1.
    throw new UnsupportedOperationException();
  }

  public Set<T> getEquivalenceClass(T vertex) {
    // TODO: Task 1.
    throw new UnsupportedOperationException();
  }

  public List<T> iterativeBreadthFirstSearch() {
    // TODO: Task 2.
    throw new UnsupportedOperationException();
  }

  public List<T> iterativeDepthFirstSearch() {
    // TODO: Task 2.
    throw new UnsupportedOperationException();
  }

  public List<T> recursiveBreadthFirstSearch() {
    // TODO: Task 3.
    throw new UnsupportedOperationException();
  }

  public List<T> recursiveDepthFirstSearch() {
    // TODO: Task 3.
    throw new UnsupportedOperationException();
  }
}
