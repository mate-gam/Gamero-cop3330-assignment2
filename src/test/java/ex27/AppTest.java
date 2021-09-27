package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInputTest()
    {
        App app = new App();
        assertAll(() -> assertEquals("There were no errors found.", app.validateInput("John", "Johnson", "55555", "TK-4321")),
                () -> assertEquals("The first name must be at least 2 characters long.\n" +
                        "The last name must be at least 2 characters long.\n" +
                        "The last name must be filled in.\n" +
                        "The employee ID must be in the format of AA-1234.\n" +
                        "The zipcode must be a 5 digit number.", app.validateInput("J", "", "ABCDE", "A12-1234")),
                () -> assertEquals("The first name must be at least 2 characters long.\n" +
                        "The first name must be filled in.\n", app.validateInput("", "Patrick", "12345", "AA-5555")));
    }
}