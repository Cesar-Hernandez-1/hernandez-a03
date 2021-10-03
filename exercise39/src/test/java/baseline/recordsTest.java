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
                "Jake Jacobson       | Programmer        | \n" +
                "John Johnson        | Manager           | 2016-12-31\n" +
                "Michaela Michaelson | District Manager  | 2015-12-19\n" +
                "Sally Weber         | Web Developer     | 2015-12-18\n" +
                "Tou Xiong           | Software Engineer | 2016-10-05";
        app.initialize();

        assertEquals(output, app.getTable());
    }
}