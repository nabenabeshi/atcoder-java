package atcoder.B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("C",Main.aToZString2(1,3));
  }
  
  @Test
  void test02() {
    assertEquals("F", Main.aToZString2(2, 12));
  }
}