import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    void shouldSortAnArrayOfIntegers() {
        List<Integer> input = Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0);
        List<Integer> expected = Arrays.asList(0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283);

        List<Integer> actual = BubbleSort.sort(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSortASingleItemArray() {
        List<Integer> input = Arrays.asList(99);
        List<Integer> expected = Arrays.asList(99);

        List<Integer> actual = BubbleSort.sort(input);
        assertEquals(expected, actual);
    }

}
