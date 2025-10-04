package atcoder.B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("o", Main.func("odd"));
    assertEquals("a", Main.func("dad"));
    assertEquals("v", Main.func("wwwwwwwwwv"));
  }
}