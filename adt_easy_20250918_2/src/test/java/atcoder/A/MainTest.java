package atcoder.A;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    int inputIntArr[][] = {
      {3,15},
      {1,15},
      {3,8},
    };
    String expectedStr;
    expectedStr  = "1 15\r\n";
    expectedStr += "3 8\r\n";
    expectedStr += "3 15\r\n";
    assertEquals(
      expectedStr,
      Main.sortDate(inputIntArr));
  }

  @Test
  void test02() {
    int inputIntArr[][] = {
        { 1, 1 },
        { 1, 2 },
        { 1, 3 },
        { 1, 4 },
        { 1, 5 },
    };
    String expectedStr = "";
    expectedStr += "1 1\r\n";
    expectedStr += "1 2\r\n";
    expectedStr += "1 3\r\n";
    expectedStr += "1 4\r\n";
    expectedStr += "1 5\r\n";
    assertEquals(
        expectedStr,
        Main.sortDate(inputIntArr));
  }

  @Test
  void test03() {
    int inputIntArr[][] = {
        { 9, 21},
        { 8, 22},
        { 10, 28},
        { 6, 22},
        { 6, 26},
        { 7, 10},
        { 5, 3 },
        { 8, 31},
        { 9, 4 },
        { 11, 21},
    };
    String expectedStr = "";
    expectedStr += "5 3\r\n";
    expectedStr += "6 22\r\n";
    expectedStr += "6 26\r\n";
    expectedStr += "7 10\r\n";
    expectedStr += "8 22\r\n";
    expectedStr += "8 31\r\n";
    expectedStr += "9 4\r\n";
    expectedStr += "9 21\r\n";
    expectedStr += "10 28\r\n";
    expectedStr += "11 21\r\n";
    
    assertEquals(
        expectedStr,
        Main.sortDate(inputIntArr));
  }
}