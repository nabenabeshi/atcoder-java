package atcoder.C;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    int inputN = 6;
    int inputIntArr[][] = {
        { 0, 0 },
        { 1, 3 },
        { 3, 2 },
        { 5, 5 },
        { 4, 6 },
        { 6, 4 },
    };
    assertEquals("3", Main.func1(inputIntArr, inputN));
  }

  @Test
  void test02() {
    int inputN = 4;
    int inputIntArr[][] = {
        { 0, 0 },
        { 0, 0 },
        { 0, 0 },
        { 0, 0 },
    };
    assertEquals("4", Main.func1(inputIntArr, inputN));
  }
}