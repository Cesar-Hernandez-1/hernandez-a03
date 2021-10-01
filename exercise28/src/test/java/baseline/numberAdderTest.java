package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numberAdderTest {

    @Test
    void getSum() {
        numberAdder app = new numberAdder();

        for(int i = 1; i < 6; i++){
            app.setSum(i);
        }

        assertEquals(15,app.getSum());
    }
}