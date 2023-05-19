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

  /**
   * Returns true if for every vertex a, b in the set of vertices, if (a, b) are in the set of edges
   * then (b, a) is in the set of edges.
   *
   * @return True if the graph is symmetric.
   */
  public boolean isSymmetric() {
    for (Edge<T> edge : edges) {
      if (!reverseEdgeExists(edge)) {
        return false;
      }
    }

    return true;
  }

  /**
   * Helper function to check whether the edge going in the opposite direction exists when given a
   * directed edge.
   *
   * @param edgeToCheck The edge that may or may not have a reverse included in the graph.
   * @return True if the reverse edge to the input edge exists within the graph.
   */
  private boolean reverseEdgeExists(Edge<T> edgeToCheck) {
    for (Edge<T> edge : edges) {
      if (edge.getSource().equals(edgeToCheck.getDestination())
          && edge.getDestination().equals(edgeToCheck.getSource())) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns true if for every vertex a, b, c in the set of vertices, if (a, b) and (b, c) are in
   * the set of edges then (a, c) is in the set of edges.
   *
   * @return True if the graph is transitive.
   */
  public boolean isTransitive() {
    for (Edge<T> edgeA : edges) {
      for (Edge<T> edgeB : edges) {
        if (edgeA.getDestination().equals(edgeB.getSource())
            && !transitiveEdgeExists(edgeA, edgeB)) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Helper function to determine whether there is an edge originating from the vertex edgeA
   * originates from and points to the vertex edgeB points to.
   *
   * @param edgeA The edge (a, b) in the set of edges.
   * @param edgeB The edge (b, c) in the set of edges.
   * @return True if the edge (a, c) exists within the set of edges.
   */
  private boolean transitiveEdgeExists(Edge<T> edgeA, Edge<T> edgeB) {
    for (Edge<T> edge : edges) {
      if (edge.getSource().equals(edgeA.getSource())
          && edge.getDestination().equals(edgeB.getDestination())) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns true if for every vertex a, b in the set of vertices, if (a, b) and (b, a) are in the
   * set of edges then (a = b).
   *
   * @return True if the graph if antisymmetric.
   */
  public boolean isAntiSymmetric() {
    for (Edge<T> edgeA : edges) {
      for (Edge<T> edgeB : edges) {
        if (edgeA.getSource().equals(edgeB.getDestination())
            && edgeA.getDestination().equals(edgeB.getSource())
            && !edgeA.getSource().equals(edgeB.getSource())) {
          return false;
        }
      }
    }

    return true;
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
