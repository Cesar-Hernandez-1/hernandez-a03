package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class recordsTest {

    @Test
    void getTable() {
        records app = new records();
        String output = "Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------\n" +
                "Jacquelyn Jackson   | DBA               | \n" +
                "Jake Jacobson       | Programmer        | ";
        app.initialize();

        assertEquals(output, app.getTable("Jac"));
    }
}