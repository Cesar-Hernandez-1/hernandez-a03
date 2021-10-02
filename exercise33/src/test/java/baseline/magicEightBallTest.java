package baseline;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class magicEightBallTest {

    @Test
    void answer() {
        magicEightBall app = new magicEightBall();
        String question = "How are you?";
        String answer = "";
        while(!Objects.equals(answer, "Yes.")){
            answer = app.answer(question);
        }
        assertEquals("Yes.", answer);

        while(!Objects.equals(answer, "No.")){
            answer = app.answer(question);
        }
        assertEquals("No.", answer);

        while(!Objects.equals(answer, "Maybe.")){
            answer = app.answer(question);
        }
        assertEquals("Maybe.", answer);

        while(!Objects.equals(answer, "Ask again later.")){
            answer = app.answer(question);
        }
        assertEquals("Ask again later.", answer);
    }
}