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
  MainTest.Task3.class,
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

    @Test
    public void T1_M25_ME_roots() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("[1]");
    }

    @Test
    public void T1_M26_ME_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M27_ME_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M28_ME_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_M29_ME_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M30_ME_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M31_MF_roots() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("[]");
    }

    @Test
    public void T1_M32_MF_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M33_MF_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_M34_MF_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_M35_MF_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void T1_M36_MF_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M37_MG_roots() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_M38_MG_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M39_MG_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M40_MG_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M41_MG_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M42_MG_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M43_MH_roots() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("[0, 21]");
    }

    @Test
    public void T1_M44_MH_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void T1_M45_MH_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void T1_M46_MH_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M47_MH_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void T1_M48_MH_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains("The graph is an equivalence relation");
    }

    @Test
    public void T1_M49_MI_roots() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("[0]");
    }

    @Test
    public void T1_M50_MI_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M51_MI_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M52_MI_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_M53_MI_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M54_MI_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M49_MJ_roots() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("[0, 6]");
    }

    @Test
    public void T1_M50_MJ_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M51_MJ_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M52_MJ_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("The graph is NOT transitive");
    }

    @Test
    public void T1_M53_MJ_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M54_MJ_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void T1_M55_MK_roots() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("[1]");
    }

    @Test
    public void T1_M56_MK_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("The graph is NOT reflexive");
    }

    @Test
    public void T1_M57_MK_symmetry() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void T1_M58_MK_transitivity() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void T1_M59_MK_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void T1_M60_MK_equivalence() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("The graph is NOT an equivalence relation");
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

    @Test
    public void T2_M09_ME_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("[1, 2, 3, 4, 8, 9, 5, 6, 7]");
    }

    @Test
    public void T2_M10_ME_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("[1, 2, 8, 9, 3, 5, 6, 4, 7]");
    }

    @Test
    public void T2_M11_MF_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("[]");
    }

    @Test
    public void T2_M12_MF_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("[]");
    }

    @Test
    public void T2_M13_MG_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
    }

    @Test
    public void T2_M14_MG_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
    }

    @Test
    public void T2_M15_MH_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,"
              + " 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,"
              + " 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,"
              + " 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]");
    }

    @Test
    public void T2_M16_MH_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,"
              + " 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,"
              + " 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,"
              + " 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]");
    }

    @Test
    public void T2_M17_MI_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7]");
    }

    @Test
    public void T2_M18_MI_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("[0, 1, 3, 4, 5, 2, 6, 7]");
    }

    @Test
    public void T2_M19_MJ_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6]");
    }

    @Test
    public void T2_M20_MJ_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("[0, 1, 3, 4, 5, 2, 6]");
    }

    @Test
    public void T2_M21_MK_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("[1, 2, 3, 4]");
    }

    @Test
    public void T2_M22_MK_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("[1, 2, 4, 3]");
    }

    /* Task 3 */

    @Test
    public void T3_M01_MA_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("[1]");
    }

    @Test
    public void T3_M02_MA_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_a.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_a.txt");
      assertContains("[1]");
    }

    @Test
    public void T3_M03_MB_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("[0, 1]");
    }

    @Test
    public void T3_M04_MB_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_b.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_b.txt");
      assertContains("[0, 1]");
    }

    @Test
    public void T3_M05_MC_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("[0]");
    }

    @Test
    public void T3_M06_MC_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_c.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_c.txt");
      assertContains("[0]");
    }

    @Test
    public void T3_M07_MD_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("[0, 1, 2, 3, 5, 4, 6, 7, 8, 9]");
    }

    @Test
    public void T3_M08_MD_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_d.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_d.txt");
      assertContains("[0, 1, 2, 3, 5, 4, 6, 7, 8, 9]");
    }

    @Test
    public void T3_M09_ME_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("[1, 2, 3, 4, 8, 9, 5, 6, 7]");
    }

    @Test
    public void T3_M10_ME_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_e.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_e.txt");
      assertContains("[1, 2, 8, 9, 3, 5, 6, 4, 7]");
    }

    @Test
    public void T3_M11_MF_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("[]");
    }

    @Test
    public void T3_M12_MF_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_f.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_f.txt");
      assertContains("[]");
    }

    @Test
    public void T3_M13_MG_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
    }

    @Test
    public void T3_M14_MG_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_g.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_g.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
    }

    @Test
    public void T3_M15_MH_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,"
              + " 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,"
              + " 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,"
              + " 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]");
    }

    @Test
    public void T3_M16_MH_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_h.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_h.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,"
              + " 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,"
              + " 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,"
              + " 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]");
    }

    @Test
    public void T3_M17_MI_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6, 7]");
    }

    @Test
    public void T3_M18_MI_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_i.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_i.txt");
      assertContains("[0, 1, 3, 4, 5, 2, 6, 7]");
    }

    @Test
    public void T3_M19_MJ_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("[0, 1, 2, 3, 4, 5, 6]");
    }

    @Test
    public void T3_M20_MJ_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_j.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_j.txt");
      assertContains("[0, 1, 3, 4, 5, 2, 6]");
    }

    @Test
    public void T3_M21_MK_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("[1, 2, 3, 4]");
    }

    @Test
    public void T3_M22_MK_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "m_k.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file m_k.txt");
      assertContains("[1, 2, 4, 3]");
    }

    /* Other's Test Cases */

    @Test
    public void TY_D_roots() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("[1]");
    }

    @Test
    public void TY_D_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void TY_D_symmetry() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void TY_D_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void TY_D_transitivity() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void TY_D_equivalence() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("The graph is an equivalence relation");
    }

    @Test
    public void TY_D_equivalence_class_1() throws Exception {
      runCommands(OPEN_FILE, "o_a.txt", COMPUTE_EQUIVALENCE, 1);
      assertContains("Successfully opened graph from file o_a.txt");
      assertContains("[1, 2, 3, 4]");
    }

    @Test
    public void TY_E_roots() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("[]");
    }

    @Test
    public void TY_E_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void TY_E_symmetry() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("The graph is NOT symmetric");
    }

    @Test
    public void TY_E_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("The graph is NOT antisymmetric");
    }

    @Test
    public void TY_E_transitivity() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void TY_E_equivalence() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("The graph is NOT an equivalence relation");
    }

    @Test
    public void TY_E_equivalence_class_0() throws Exception {
      runCommands(OPEN_FILE, "o_b.txt", COMPUTE_EQUIVALENCE, 1);
      assertContains("Successfully opened graph from file o_b.txt");
      assertContains("[]");
    }

    @Test
    public void TY_F_roots() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("[0]");
    }

    @Test
    public void TY_F_reflexivity() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", CHECK_REFLEXIVITY);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("The graph is reflexive");
    }

    @Test
    public void TY_F_symmetry() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", CHECK_SYMMETRY);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("The graph is symmetric");
    }

    @Test
    public void TY_F_antisymmetry() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", CHECK_ANTISYMMETRY);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("The graph is antisymmetric");
    }

    @Test
    public void TY_F_transitivity() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", CHECK_TRANSITIVITY);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("The graph is transitive");
    }

    @Test
    public void TY_F_equivalence() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", CHECK_EQUIVALENCE);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("The graph is an equivalence relation");
    }

    @Test
    public void TY_F_equivalence_class_0() throws Exception {
      runCommands(OPEN_FILE, "o_c.txt", COMPUTE_EQUIVALENCE, 0);
      assertContains("Successfully opened graph from file o_c.txt");
      assertContains("[0]");
    }

    // dfs and bfs random graph, you can delete the successfully opend from file test case
    @Test
    public void TY_01_G_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "o_d.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file o_d.txt");
      assertContains("[1, 3, 5, 6, 9, 11, 7, 2, 12, 4, 8, 10]");
    }

    @Test
    public void TY_02_G_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "o_d.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file o_d.txt");
      assertContains("[1, 3, 5, 7, 6, 2, 4, 10, 8, 9, 11, 12]");
    }

    @Test
    public void TY_03_G_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "o_d.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file o_d.txt");
      assertContains("[1, 3, 5, 6, 9, 11, 7, 2, 12, 4, 8, 10]");
    }

    @Test
    public void TY_04_G_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "o_d.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file o_d.txt");
      assertContains("[1, 3, 5, 7, 6, 2, 4, 10, 8, 9, 11, 12]");
    }

    // dfs and bfs with 25 vertices
    @Test
    public void TY_01_H_iterative_BFS() throws Exception {
      runCommands(OPEN_FILE, "o_e.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file o_e.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24]");
    }

    @Test
    public void TY_02_H_iterative_DFS() throws Exception {
      runCommands(OPEN_FILE, "o_e.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file o_e.txt");
      assertContains(
          "[0, 1, 3, 7, 15, 19, 22, 24, 8, 4, 9, 16, 20, 23, 10, 2, 5, 11, 17, 21, 12, 6, 13, 18,"
              + " 14]");
    }

    @Test
    public void TY_03_H_recursive_BFS() throws Exception {
      runCommands(OPEN_FILE, "o_e.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file o_e.txt");
      assertContains(
          "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,"
              + " 24]");
    }

    @Test
    public void TY_04_H_recursive_DFS() throws Exception {
      runCommands(OPEN_FILE, "o_e.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file o_e.txt");
      assertContains(
          "[0, 1, 3, 7, 15, 19, 22, 24, 8, 4, 9, 16, 20, 23, 10, 2, 5, 11, 17, 21, 12, 6, 13, 18,"
              + " 14]");
    }

    // Check if the roots are given in order
    @Test
    public void TY_01_I_check_roots() throws Exception {
      runCommands(OPEN_FILE, "o_f.txt", LIST_ROOT_VERTICIES);
      assertContains("Successfully opened graph from file o_f.txt");
      assertContains("[0, 2, 10, 12, 20, 100]");
      assertDoesNotContain("[0, 10, 12, 100, 2, 20]");
    }

    // dfs and bfs of i.txt (or whatever you named the file I have given you)
    @Test
    public void TY_02_I_IBFS() throws Exception {
      runCommands(OPEN_FILE, "o_f.txt", GRAPH_SEARCH_IBFS);
      assertContains("Successfully opened graph from file o_f.txt");
      assertContains("[0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 100, 101]");
    }

    @Test
    public void TY_03_I_RBFS() throws Exception {
      runCommands(OPEN_FILE, "o_f.txt", GRAPH_SEARCH_RBFS);
      assertContains("Successfully opened graph from file o_f.txt");
      assertContains("[0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 100, 101]");
    }

    @Test
    public void TY_04_I_IDFS() throws Exception {
      runCommands(OPEN_FILE, "o_f.txt", GRAPH_SEARCH_IDFS);
      assertContains("Successfully opened graph from file o_f.txt");
      assertContains("[0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 100, 101]");
    }

    @Test
    public void TY_05_I_RDFS() throws Exception {
      runCommands(OPEN_FILE, "o_f.txt", GRAPH_SEARCH_RDFS);
      assertContains("Successfully opened graph from file o_f.txt");
      assertContains("[0, 1, 2, 3, 10, 11, 12, 13, 20, 21, 100, 101]");
    }
  }
}
