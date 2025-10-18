package atcoder.B;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void test01() {
    assertEquals("2\novo owo", Main.func(9,3,"ovowowovo"));
    assertEquals("5\no", Main.func(9, 1, "ovowowovo"));
    assertEquals("2\nthe", Main.func(35, 3, "thequickbrownfoxjumpsoverthelazydog"));
  }
}
