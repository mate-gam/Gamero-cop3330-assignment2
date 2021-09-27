package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randomPrint()
    {
        App appTest = new App();
        String[] random = {"Yes", "No", "Maybe","Ask again later."};
        assertAll(() -> assertEquals("Yes", appTest.randomPrint(random, 0)),
                () -> assertEquals("No", appTest.randomPrint(random, 1)),
                () -> assertEquals("Maybe", appTest.randomPrint(random, 2)),
                () -> assertEquals("Ask again later.", appTest.randomPrint(random, 3)));
    }
}