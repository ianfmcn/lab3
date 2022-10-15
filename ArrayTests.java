import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceSizeGreaterThan1() {
    int[] input2 = {1,2,3,4,5};
    int[] reversed = {5,4,3,2,1};
    ArrayExamples.reverseInPlace(input2);
    for (int i = 0; i<5; i++) {
      System.out.println(input2[i]);
    }
    assertArrayEquals(reversed, input2);
  }

  @Test
  public void testReversedSizeGreaterThan1() {
    int[] input2 = {1,2,3,4,5};
    int[] transfer = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{5,4,3,2,1}, transfer);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] dubList1 = {1.0,2.0,3.0};
    assertEquals(2.5,ArrayExamples.averageWithoutLowest(dubList1),0.0);
    double[] dubList2 = {1.0};
    assertEquals(0,ArrayExamples.averageWithoutLowest(dubList2),0.0);
    double[] dubList3 = {};
    assertEquals(0,ArrayExamples.averageWithoutLowest(dubList3),0.0);
    double[] dubList4 = {1.0,1.0,2.0,3.0,4.0,5.0};
    assertEquals(3.0,ArrayExamples.averageWithoutLowest(dubList4),0.0);

  }
}
