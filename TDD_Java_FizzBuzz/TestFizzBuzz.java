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

@Test
public void testPrintsNumberFizzwhen3() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

@Test
public void testPrintsNumberFizzwhen6() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

@Test
public void testPrintsNumberBuzzwhen5() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

@Test
public void testPrintsNumberBuzzwhen10() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

@Test
public void testPrintsNumberFizzBuzzwhen15() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

@Test
public void testPrintsNumberFizzBuzzwhen30() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    }

 }
