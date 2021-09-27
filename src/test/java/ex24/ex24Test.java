package ex24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ex24Test
{
    @Test
    public void testEx24()
    {
        App test = new App();
        assertAll(() -> assertTrue(test.isAnagram("note", "tone")),
                () -> assertFalse(test.isAnagram("noe", "tone")),
                () -> assertFalse(test.isAnagram("note", "tne")),
                () -> assertTrue(test.isAnagram("gwsf", "wgsf")));
    }
}

