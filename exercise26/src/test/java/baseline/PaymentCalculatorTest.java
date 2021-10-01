package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator app = new PaymentCalculator();
        app.setBalance(5000);
        app.setApr(12);
        app.setMonthlyPayment(100);

        assertEquals(70,app.calculateMonthsUntilPaidOff(), 0.7);
    }
}