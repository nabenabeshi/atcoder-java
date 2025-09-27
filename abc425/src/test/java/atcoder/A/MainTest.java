package atcoder.A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("-20", Main.func(3));
    assertEquals("-425", Main.func(9));
    assertEquals("575", Main.func(10));
  }
}