import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class TestLists {
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("test");
        input.add("tester");
        input.add("rest");
        input.add("rester");
        List<String> expected = new ArrayList<>();
        expected.add("test");
        expected.add("rest");
        input = ListExamples.filter(input, new VowelChecker());
        assertArrayEquals(expected.toArray(), input.toArray());
        return;
    }
    
    @Test
    public void testListExamples(){
        return;
    }

    @Test
    public void testMerge() {
    }
}