package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filterTest {

    @Test
    void filterEvenNumbers() {
        filter app = new filter();
        Character [] numbers = {'1','2','3','4','5','6','7','8'};
        Character [] output = app.filterEvenNumbers(numbers);
        for(int i = 2, j = 0; i < 9; i += 2, j++){
            assertEquals(String.valueOf(i).charAt(0), output[j]);
        }
    }
}