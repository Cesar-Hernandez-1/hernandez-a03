package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void main() {
        anagramHelp app = new anagramHelp();

        String word1 = "note";
        String word2 = "tone";

        assertTrue(app.isAnagram(word1, word2));
    }
}