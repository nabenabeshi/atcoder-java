package atcoder.C;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test01() {
    assertEquals(
        "2",
        Main.func(5, 8,
            new int[][] {
                { 1, 2 },
                { 1, 3 },
                { 1, 4 },
                { 2, 3 },
                { 2, 5 },
                { 3, 4 },
                { 3, 5 },
                { 4, 5 },
            }));
  }
}