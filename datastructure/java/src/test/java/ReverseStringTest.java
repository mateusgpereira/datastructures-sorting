import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseStringTest {

    @Test
    void shouldReverseString() {
        String input = "Hi! I love Java!";
        String result = ReverseString.reverseString(input);
        assertEquals("!avaJ evol I !iH", result);
    }

    @Test
    void shouldThrowErrorIfInputIsNull() {
        assertThrows(RuntimeException.class, () -> ReverseString.reverseString(null));
    }

    @Test
    void shouldReturnEmptyStringWhenInputIsEmpty() {
        String input = "";
        String result = ReverseString.reverseString(input);
        assertEquals("", result);
    }

    @Test
    void shouldReturnSameLetterInASingleLetterString() {
        String input = "J";
        String result = ReverseString.reverseString(input);
        assertEquals("J", result);
    }
}
