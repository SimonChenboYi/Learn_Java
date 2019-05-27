import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

@Test
 public void testPrintsNumber1() {
     assertEquals("1", FizzBuzz.fizzbuzz(1));
     }

@Test
public void testPrintsNumber2() {
    assertEquals("2", FizzBuzz.fizzbuzz(2));
    }

 }
