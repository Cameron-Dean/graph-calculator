package nz.ac.auckland.se281.datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
    this.edges = new TreeSet<>(edges);
  }

  /**
   * Returns a set of the vertices in the graph that have either degree 0 or are in an equivalence
   * class. If in an equivalence class, the vertex with the least value will be returned in the set
   * of vertices.
   *
   * @return The set of root vertices in the graph.
   */
  public Set<T> getRoots() {
    Set<T> roots = new TreeSet<>();

    if (isEquivalence()) {
      for (T vertex : vertices) {
        Set<T> equivalenceClass = getEquivalenceClass(vertex);

        // add first vertex in equivalence class set to roots set
        for (T equivalenceVertex : equivalenceClass) {
          roots.add(equivalenceVertex);
          break;
        }
      }

      // self loops prevent equivalence relation from having vertices with in-degree 0, so exit
      // method
      return roots;
    }

    for (T vertex : vertices) {
      if (getInDegree(vertex) == 0) {
        roots.add(vertex);
      }
    }

    return roots;
  }

  /**
   * Helper function which returns the number of edges pointing to a specific vertex.
   *
   * @param vertex The vertex to search for in graph.
   * @return The in-degree of vertex.
   */
  private int getInDegree(T vertex) {
    int inDegree = 0;

    for (Edge<T> edge : edges) {
      if (edge.getDestination().equals(vertex)) {
        inDegree++;
      }
    }

    return inDegree;
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
        if (edgeA.getSource().equals(edgeB.getDestination()) // (a, ?), (?, a) is in graph
            && edgeA.getDestination().equals(edgeB.getSource()) // (?, b), (b, ?) is in graph
            && !edgeA.getSource().equals(edgeB.getSource())) {
          // a is not equal to b so not antisymmetric
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Returns true if the graph is reflexive, symmetric, and transitive.
   *
   * @return True if the graph is an equivalence relation.
   */
  public boolean isEquivalence() {
    return isReflexive() && isSymmetric() && isTransitive();
  }

  /**
   * Returns a set of vertices where each vertex is equivalent to the input vertex. An empty set is
   * returned if the graph is not an equivalence relation.
   *
   * @param vertex The vertex to find all equivalent vertices.
   * @return The set of vertices in the same equivalence class as the input vertex.
   */
  public Set<T> getEquivalenceClass(T vertex) {
    if (!isEquivalence()) {
      return new HashSet<>();
    }

    Set<T> equivalenceClass = new TreeSet<>();

    // since graph has to be transitive, add any edges originating at vertex
    for (Edge<T> edge : edges) {
      if (edge.getSource().equals(vertex)) {
        equivalenceClass.add(edge.getDestination());
      }
    }

    return equivalenceClass;
  }

  /**
   * Returns a list of the vertices traversed using breadth-first search, where the least vertex is
   * visited first.
   *
   * @return The list of vertices traversed using breadth-first search.
   */
  public List<T> iterativeBreadthFirstSearch() {
    Set<T> roots = getRoots();
    List<T> visited = new ArrayList<>();
    Queue<T> queue = new Queue<>();

    // traverse from each root
    for (T root : roots) {
      visited.add(root);
      queue.enqueue(root);

      while (!queue.isEmpty()) {
        T vertex = queue.dequeue();

        for (Edge<T> edge : edges) {
          if (edge.getSource().equals(vertex) && !visited.contains(edge.getDestination())) {
            visited.add(edge.getDestination());
            queue.enqueue(edge.getDestination());
          }
        }
      }
    }

    return visited;
  }

  /**
   * Returns a list of the vertices traversed using depth-first search, where the least vertex is
   * visited first.
   *
   * @return The list of vertices traversed using depth-first search.
   */
  public List<T> iterativeDepthFirstSearch() {
    Set<T> roots = getRoots();
    Set<Edge<T>> reverseEdges = new TreeSet<>(edges).descendingSet();
    List<T> visited = new ArrayList<>();
    Stack<T> stack = new Stack<>();

    // traverse from each root
    for (T root : roots) {
      visited.add(root);
      stack.push(root);

      while (!stack.isEmpty()) {
        T vertex = stack.pop();

        if (!visited.contains(vertex)) {
          visited.add(vertex);
        }

        for (Edge<T> edge : reverseEdges) {
          if (edge.getSource().equals(vertex) && !visited.contains(edge.getDestination())) {
            stack.push(edge.getDestination());
          }
        }
      }
    }

    return visited;
  }

  /**
   * Returns a list of the vertices traversed using recursive breadth-first search, where the least
   * vertex is visited first.
   *
   * @return The list of vertices traversed using breadth-first search recursively.
   */
  public List<T> recursiveBreadthFirstSearch() {
    Set<T> roots = getRoots();
    List<T> visited = new ArrayList<>();
    Queue<T> queue = new Queue<>();

    // traverse from each root
    for (T root : roots) {
      visited.add(root);
      queue.enqueue(root);
      recursiveBreadthFirstSearchHelper(visited, queue);
    }

    return visited;
  }

  /**
   * Helper function for recursive breadth-first search.
   *
   * @param visited The list of vertices visited so far.
   * @param queue The queue of vertices to visit.
   */
  private void recursiveBreadthFirstSearchHelper(List<T> visited, Queue<T> queue) {
    // base case
    if (queue.isEmpty()) {
      return;
    }

    T vertex = queue.dequeue();

    // add all vertices next to vertex to the queue
    for (Edge<T> edge : edges) {
      if (edge.getSource().equals(vertex) && !visited.contains(edge.getDestination())) {
        visited.add(edge.getDestination());
        queue.enqueue(edge.getDestination());
      }
    }

    recursiveBreadthFirstSearchHelper(visited, queue);
  }

  public List<T> recursiveDepthFirstSearch() {
    // TODO: Task 3.
    throw new UnsupportedOperationException();
  }
}
