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

  @Test
  public void getDefinitions_initiallyReturnsEmptyArrayList() {
    Word myWord = new Word("Snow");
    assertTrue(myWord.getDefinitions() instanceof ArrayList);
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Snow");
    Word secondWord = new Word("Ice");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void clear_removesAllWordInstancesFromMemory() {
    Word myWord = new Word("Snow");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

}
