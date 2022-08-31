import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MyFirstTest {


    @Before
    public void setUp() {

    }

    @Test
    public void testAssertEquals() {
        String actual = "Codeup";

        assertEquals("Codeup", actual);
        assertNotEquals("codeup", actual);
    }

    @Test
    public void testAssertNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(moreLanguages, languages);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testAssertTrueAndFalse() {
        String language = "PHP";

        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
    // testing
}
