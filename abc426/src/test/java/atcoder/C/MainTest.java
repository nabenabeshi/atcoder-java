package atcoder.C;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test01() {
    int n = 8, q = 5;
    ArrayList<ArrayList<Integer>> arr2d = new ArrayList<>();
    arr2d.add(new ArrayList<>(Arrays.asList(2, 6)));
    arr2d.add(new ArrayList<>(Arrays.asList(3, 5)));
    arr2d.add(new ArrayList<>(Arrays.asList(1, 7)));
    arr2d.add(new ArrayList<>(Arrays.asList(5, 7)));
    arr2d.add(new ArrayList<>(Arrays.asList(7, 8)));
    //assertEquals("", Main.func(n, q, arr2d));
    assertEquals("2\n1\n0\n3\n7\n", Main.func(n, q, arr2d));
  }
}