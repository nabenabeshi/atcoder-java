package atcoder.C;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

class MainTest {
  @Test
  void test01() {
    int n = 8, q = 5;
    ArrayList<ArrayList<Integer>> arr2d = new ArrayList<ArrayList<Integer>>();
    arr2d.add(new ArrayList<Integer>(Arrays.asList(2, 6)));
    arr2d.add(new ArrayList<Integer>(Arrays.asList(3, 5)));
    arr2d.add(new ArrayList<Integer>(Arrays.asList(1, 7)));
    arr2d.add(new ArrayList<Integer>(Arrays.asList(5, 7)));
    arr2d.add(new ArrayList<Integer>(Arrays.asList(7, 8)));
    //assertEquals("", Main.func(n, q, arr2d));
    assertEquals("2\n1\n0\n3\n7\n", Main.func(n, q, arr2d));
  }
}