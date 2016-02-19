import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("To sleep");
    assertEquals(true, myDefinition instanceof Definition);
  }








  @Rule
  public ClearRule clearRule = new ClearRule();
}
