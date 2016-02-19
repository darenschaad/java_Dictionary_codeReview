import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("To sleep");
    assertEquals(true, myDefinition instanceof Definition);
  }
  @Test
  public void definition_instantiatesWithDescription_true() {
    Definition myDefinition = new Definition("To sleep");
    assertEquals("To sleep", myDefinition.getDescription());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("To sleep");
    Definition secondDefinition = new Definition("To eat");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void newId_definitionInstantiatesWithAnId_true() {
    Definition myDefinition = new Definition("To sleep");
    assertEquals(Definition.all().size(), myDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("To eat");
    Definition secondDefinition = new Definition("To sleep");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList() {
    Definition myDefinition = new Definition("To eat");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }



  @Rule
  public ClearRule clearRule = new ClearRule();
}
