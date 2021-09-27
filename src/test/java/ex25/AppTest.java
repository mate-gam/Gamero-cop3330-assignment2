package ex25;

import ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator()
    {
        ex25.App test = new App();
        assertAll(() -> assertEquals("The password '12345' is a very weak password.", test.passwordValidator("12345")),
                () -> assertEquals("The password 'abcdef' is a weak password.", test.passwordValidator("abcdef")),
                () -> assertEquals("The password 'abc123xyz' is a strong password.", test.passwordValidator("abc123xyz")),
                () -> assertEquals("The password '1337h@xor!' is a very strong password.", test.passwordValidator("1337h@xor!")),
                () -> assertNotEquals("The password 'ab!3' is a very strong password.", test.passwordValidator("ab!3")));
    }
}