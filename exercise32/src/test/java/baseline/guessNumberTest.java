package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessNumberTest {

    @Test
    void play() {
        guessNumber app = new guessNumber();
        String output = "";
        int counter = 0;
        app.setDifficulty("1");
        while(output.equals("")){
            output = app.play(counter);
            counter++;
        }
        assertTrue(output.contains("You got it in "));
    }
}