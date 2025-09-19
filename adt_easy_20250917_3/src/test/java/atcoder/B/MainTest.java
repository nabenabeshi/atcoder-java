package atcoder.B;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    // テストケース1
    String[] sArray1 = {
      "january",
      "february",
      "march",
      "april",
      "may",
      "june",
      "july",
      "august",
      "september",
      "october",
      "november",
      "december"
    };
    assertEquals(
      1,
      Main.September(
        sArray1
      )
    );

    // テストケース2
    String[] sArray2 = {
      "ve",
      "inrtfa",
      "npccxva",
      "djiq",
      "lmbkktngaovl",
      "mlfiv",
      "fmbvcmuxuwggfq",
      "qgmtwxmb",
      "jii",
      "ts",
      "bfxrvs",
      "eqvy"
    };
    assertEquals(
      2,
      Main.September(
        sArray2
      )
    );
  }
}