package baseline;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class pickWinnerTest {

    @Test
    void getWinner() {
        pickWinner app = new pickWinner();
        String output = "";
        app.addName("Homer");
        app.addName("Bart");
        app.addName("Maggie");
        app.addName("Lisa");
        app.addName("Moe");

        while(!Objects.equals(output, "Maggie")){
            output = app.getWinner();
        }

        assertEquals("Maggie", output);
    }
}