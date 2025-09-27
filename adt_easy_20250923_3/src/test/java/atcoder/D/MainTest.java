package atcoder.D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

class MainTest {
  @Test
  void test01() {
    assertEquals("3", Main.func(new BigInteger("6")));
    assertEquals("20", Main.func(new BigInteger("2432902008176640000")));
  }
}