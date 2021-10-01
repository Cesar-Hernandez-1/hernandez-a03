package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class informationValidationTest {

    @Test
    void validateInputError() {
        informationValidation app = new informationValidation();
        String errorMessage = """
                The first name must be at least 2 characters long.
                The last name must be at least 2 characters long.
                The last name must be filled in.
                The employee ID must be in the format of AA-1234.
                The zipcode must be a 5 digit number.
                """;

        assertEquals("There were no errors found.",app.validateInput("John","Johnson",
                "55555", "TK-4321"));

        assertEquals(errorMessage,app.validateInput("J","","ABCDE", "A12-1234"));
    }

    @Test
    void validateInputCorrect() {
        informationValidation app = new informationValidation();

        assertEquals("There were no errors found.",app.validateInput("John","Johnson",
                "55555", "TK-4321"));
    }
}