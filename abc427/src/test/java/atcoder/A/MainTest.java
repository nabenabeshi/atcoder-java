package atcoder.A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("ABDE", Main.func("ABCDE"));
    assertEquals("OO", Main.func("OOO"));
    assertEquals("ATCDER", Main.func("ATCODER"));
  }
}