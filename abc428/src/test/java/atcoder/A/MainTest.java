package atcoder.A;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test01() {
    assertEquals("49", Main.func(7,3,2,11));
    assertEquals("36", Main.func(6, 3, 2, 9));
  }
}