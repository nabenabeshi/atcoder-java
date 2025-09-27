package atcoder.B;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("20", Main.func(20,30,10,"Blue"));
    assertEquals("100", Main.func(100, 100, 100, "Red"));
    assertEquals("37", Main.func(37, 39, 93, "Blue"));
    assertEquals("37", Main.func(37, 39, 93, "Green"));
    assertEquals("39", Main.func(37, 39, 93, "Red"));
  }
}