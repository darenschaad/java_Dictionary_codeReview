import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word myWord = new Word("Snow");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void getName_returnsNameOfWord_true() {
    Word myWord = new Word("Snow");
    assertEquals("Snow", myWord.getName());
  }

  @Test
  public void getId_returnsWordId() {
    Word myWord = new Word("Snow");
    assertTrue(Word.all().size() == myWord.getId());
  }

}
