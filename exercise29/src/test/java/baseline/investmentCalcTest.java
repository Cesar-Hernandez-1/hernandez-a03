package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class investmentCalcTest {

    @Test
    void getInvestmentTime() {
        investmentCalc app = new investmentCalc();
        app.setReturnRate("4");
        assertEquals(18, app.getInvestmentTime());
    }
}