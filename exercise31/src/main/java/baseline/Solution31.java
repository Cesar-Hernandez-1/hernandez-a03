package baseline;

import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create karvonenHeartRate class instance to use methods from class
        karvonenHeartRate app = new karvonenHeartRate();

        //prompt user for resting pulse
        app.setRestingHR(input.nextLine());

        //prompt user for age
        app.setAge(input.nextLine());

        //display the table using user entered values
        String output = app.displayTable();

        System.out.println(output);
    }
}
