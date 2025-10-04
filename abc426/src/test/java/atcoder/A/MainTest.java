package atcoder.A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void test01() {
    assertEquals("Yes", Main.func("Serval","Ocelot"));
    assertEquals("No", Main.func("Serval","Lynx"));
    assertEquals("Yes", Main.func("Ocelot","Ocelot"));
  }
}