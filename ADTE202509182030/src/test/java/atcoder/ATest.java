// src/test/java/atcoder/ATest.java
package atcoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ATest {
  @Test
  void testSolve() {
    // テストケース1
    assertEquals(3, A.solve(1, 2), "1 + 2 should equal 3");

    // テストケース2
    assertEquals(10, A.solve(5, 5), "5 + 5 should equal 10");

    // 別のテストケースを追加
    assertEquals(-2, A.solve(-1, -1), "-1 + -1 should equal -2");
  }
}