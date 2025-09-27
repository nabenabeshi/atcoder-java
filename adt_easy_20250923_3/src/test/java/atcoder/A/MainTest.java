package atcoder.A;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("Yes", Main.func("abc", "atcoder"));
    assertEquals("No" , Main.func("arc", "agc"));
    assertEquals("Yes", Main.func("a", "aa"));
  }
}