package atcoder.B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals(
        "Yes\r\n1 3 2 4",
        Main.func(4, new int[] { 0, -1, -1, 2, -1 }));
    assertEquals(
        "No",
        Main.func(5, new int[] { 0, -1, -1, 1, -1, 1 }));
    assertEquals(
        "Yes\r\n1 3 2 4",
        Main.func(7, new int[] { 0, 3, -1, 4, -1, 5, -1, 2 }));
  }
}