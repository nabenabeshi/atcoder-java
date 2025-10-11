package atcoder.B;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test01() {
    // assertEquals(1, Main.f(1));
    // assertEquals(9, Main.f(9));
    // assertEquals(1, Main.f(10));
    // assertEquals(2, Main.f(11));
    // assertEquals(6, Main.f(123));

    // assertEquals(1, Main.f(1));
    // assertEquals(2, Main.f(2));
    // assertEquals(3, Main.f(3));
    // assertEquals(4, Main.f(4));
    assertEquals("23", Main.func("6"));
    assertEquals("427", Main.func("45"));
  }
}