package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeRemoveTest {

    @Test
    void removeEmployee() {
        employeeRemove app = new employeeRemove();
        String expectedOutput ="There are 4 employees:\n" +
                "John Smith\n" +
                "Jackie Jackson\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin\n";

        app.removeEmployee("Chris Jones");
        assertEquals(expectedOutput, app.displayEmployees());

    }
}