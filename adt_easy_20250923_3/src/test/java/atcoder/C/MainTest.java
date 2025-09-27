package atcoder.C;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("3", Main.func(4,new int[]{1,1,3,2}));
    assertEquals("0", Main.func(3, new int[] { 1, 1, 1 }));
    assertEquals("8", Main.func(10, new int[] { 2,2,4,1,1,1,4,2,2,1}));
  }
}