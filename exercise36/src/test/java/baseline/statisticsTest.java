package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class statisticsTest {
    statistics app = new statistics();

    @Test
    void average() {
        final List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(400.0, app.average(numbers));
    }

    @Test
    void max() {
        final List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(1000, app.max(numbers));
    }

    @Test
    void min() {
        final List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(100, app.min(numbers));
    }

    @Test
    void std() {
        final List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        app.average(numbers);
        assertEquals(353.55, Double.parseDouble(String.format("%.2f",app.std(numbers))));
    }
}