package atcoder.A;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("Yes", Main.oneoneslatwotwostring(5, "11/22"));
  }

  @Test
  void test02() {
    assertEquals("Yes", Main.oneoneslatwotwostring(1, "/"));
  }

  @Test
  void test03() {
    assertEquals("No", Main.oneoneslatwotwostring(4, "1/22"));
  }

  @Test
  void test04() {
    assertEquals("No", Main.oneoneslatwotwostring(5, "22/11"));
  }

  @Test
  void test05() {
    assertEquals("No", Main.oneoneslatwotwostring(5, "21/12"));
  }

  @Test
  void test06() {
    assertEquals("No", Main.oneoneslatwotwostring(5, "12/21"));
  }

  @Test
  void test07() {
    assertEquals("No", Main.oneoneslatwotwostring(5, "11/21"));
  }

  @Test
  void test08() {
    assertEquals("No", Main.oneoneslatwotwostring(5, "12/22"));
  }
}