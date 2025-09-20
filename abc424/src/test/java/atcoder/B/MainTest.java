package atcoder.B;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    int inputIntArr[][] = {
        { 1, 1 },
        { 3, 2 },
        { 2, 1 },
        { 3, 1 },
        { 1, 2 },
    };
    assertEquals("3 1", Main.func1(inputIntArr,3,2,5));
  }

    @Test
  void test02() {
    int inputIntArr[][] = {
        { 1, 1 },
        { 2, 2 },
    };
    assertEquals("", Main.func1(inputIntArr,2,2,2));
  }
}