package atcoder.A;

import org.junit.jupiter.api.Test;

//import atcoder.A.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    // テストケース1
    assertEquals("Takahashi san", Main.takahashisan("Takahashi", "Chokudai"));

    // テストケース2
    assertEquals("K san", Main.takahashisan("K", "Eyence"));
  }
}