package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordEvaluateTest {

    @Test
    void passwordValidator() {
        passwordEvaluate app = new passwordEvaluate();
        String password1 = "12345";
        String password2 = "abcdef";
        String password3 = "abc123xyz";
        String password4 = "1337h@xor!";
        String password5 = "'";

        assertEquals(1, app.passwordValidator(password1));
        assertEquals(2, app.passwordValidator(password2));
        assertEquals(3, app.passwordValidator(password3));
        assertEquals(4, app.passwordValidator(password4));
        assertEquals(5, app.passwordValidator(password5));
    }
}