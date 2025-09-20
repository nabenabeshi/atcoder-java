package atcoder.A;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("Yes", Main.func1(4,2,4));
  }

  @Test
  void test02() {
    assertEquals("No", Main.func1(3,4,5));
  }

  @Test
  void test03() {
    assertEquals("Yes", Main.func1(10,10,10));
  }

  @Test
  void test04() {
    assertEquals("Yes", Main.func1(1,1,1));
  }
}