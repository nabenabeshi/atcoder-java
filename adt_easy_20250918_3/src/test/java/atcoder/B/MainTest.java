package atcoder.B;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("4", Main.newGenerationABC(1));
    assertEquals("4", Main.newGenerationABC(125));
    assertEquals("6",  Main.newGenerationABC(126));
    assertEquals("6",  Main.newGenerationABC(211));
    assertEquals("8", Main.newGenerationABC(212));
    assertEquals("8", Main.newGenerationABC(214));
  }
}