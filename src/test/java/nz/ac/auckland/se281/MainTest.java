package nz.ac.auckland.se281;

import static nz.ac.auckland.se281.Command.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
  MainTest.Task1.class,
  MainTest.Task2.class,
  // MainTest.Task3.class, // Uncomment this line when you start Task 3
  MainTest.YourTests.class
})
public class MainTest {
  public static class Task1 extends CliTest {
    public Task1() {
      super(Main.class);
    }

    @Test
    public void T1_A_roots() throws Exception {
      runCommands(OPEN_FILE, "a.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_B_roots() throws Exception {
      runCommands(OPEN_FILE, "b.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[6]");
    }

    @Test
    public void T1_C_roots() throws Exception {
      runCommands(OPEN_FILE, "c.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0, 1]");
    }

    @Test
    public void T1_A_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "a.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_B_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "b.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_C_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "c.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void T1_A_symmetry() throws Exception {
      runCommands(OPEN_FILE, "a.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_B_symmetry() throws Exception {
      runCommands(OPEN_FILE, "b.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_C_symmetry() throws Exception {
      runCommands(OPEN_FILE, "c.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_A_transitivity() throws Exception {
      runCommands(OPEN_FILE, "a.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_B_transitivity() throws Exception {
      runCommands(OPEN_FILE, "b.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_C_transitivity() throws Exception {
      runCommands(OPEN_FILE, "c.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_A_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "a.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_B_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "b.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void T1_C_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "c.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void T1_A_equivalence() throws Exception {
      runCommands(OPEN_FILE, "a.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_B_equivalence() throws Exception {
      runCommands(OPEN_FILE, "b.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_C_equivalence() throws Exception {
      runCommands(OPEN_FILE, "c.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("The graph is an equivalence relation");
    }

    @Test
    public void T1_B_equivalence_class_1() throws Exception {
      runCommands(OPEN_FILE, "b.txt", COMPUTE_EQUIVALENCE, 1);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[]");
    }

    @Test
    public void T1_C_equivalence_class_0() throws Exception {
      runCommands(OPEN_FILE, "c.txt", COMPUTE_EQUIVALENCE, 0);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_C_equivalence_class_1() throws Exception {
      runCommands(OPEN_FILE, "c.txt", COMPUTE_EQUIVALENCE, 1);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[1, 2, 3]");
    }
  }

  public static class Task2 extends CliTest {
    public Task2() {
      super(Main.class);
    }

    @Test
    public void T2_A_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "a.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("[0, 1, 2, 3, 4, 5]");
    }

    @Test
    public void T2_B_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "b.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[6, 5, 4, 3, 2, 1, 0]");
    }

    @Test
    public void T2_C_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "c.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0, 1, 2, 3]");
    }

    @Test
    public void T2_A_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "a.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("[0, 1, 3, 4, 5, 2]");
    }

    @Test
    public void T2_B_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "b.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[6, 5, 4, 3, 2, 1, 0]");
    }

    @Test
    public void T2_C_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "c.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0, 1, 2, 3]");
    }
  }

  public static class Task3 extends CliTest {
    public Task3() {
      super(Main.class);
    }

    @Test
    public void T3_A_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "a.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("[0, 1, 2, 3, 4, 5]");
    }

    @Test
    public void T3_B_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "b.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[6, 5, 4, 3, 2, 1, 0]");
    }

    @Test
    public void T3_C_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "c.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0, 1, 2, 3]");
    }

    @Test
    public void T3_A_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "a.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file a.txt");
      assertContains("[0, 1, 3, 4, 5, 2]");
    }

    @Test
    public void T3_B_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "b.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file b.txt");
      assertContains("[6, 5, 4, 3, 2, 1, 0]");
    }

    @Test
    public void T3_C_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "c.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file c.txt");
      assertContains("[0, 1, 2, 3]");
    }
  }

  public static class YourTests extends CliTest {
    public YourTests() {
      super(Main.class);
    }

    /* Task 1 */

    @Test
    public void T1_M01_MA_roots() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("[1]");
    }

    @Test
    public void T1_M02_MA_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M03_MA_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_M04_MA_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M05_MA_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M06_MA_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M07_MB_roots() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_M08_MB_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M09_MB_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M10_MB_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M11_MB_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M12_MB_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M13_MC_roots() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_M14_MC_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M15_MC_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_M16_MC_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M17_MC_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M18_MC_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M19_MD_roots() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("[0, 3, 4, 6]");
    }

    @Test
    public void T1_M20_MD_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void T1_M21_MD_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_M22_MD_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M23_MD_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void T1_M24_MD_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("The graph is an equivalence relation");
    }

    /* Task 2 */

    @Test
    public void T2_M01_MA_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("[1]");
    }

    @Test
    public void T2_M02_MA_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("[1]");
    }

    @Test
    public void T2_M03_MB_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("[0, 1]");
    }

    @Test
    public void T2_M04_MB_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("[0, 1]");
    }

    @Test
    public void T2_M05_MC_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("[0]");
    }

    @Test
    public void T2_M06_MC_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("[0]");
    }

    @Test
    public void T2_M07_MD_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("[0, 1, 2, 3, 5, 4, 6, 7, 8, 9]");
    }

    @Test
    public void T2_M08_MD_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("[0, 1, 2, 3, 5, 4, 6, 7, 8, 9]");
    }
  }
}
