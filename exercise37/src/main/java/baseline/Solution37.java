package baseline;

import java.util.Scanner;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // create passwordGenerate class object to use methods
        passwordGenerate app = new passwordGenerate();

        //prompt user to input minimum legnth
        app.setLength(input.nextInt());

        //prompt user to enter number of special characters
        app.setSpecial(input.nextInt());

        //prompt user number of numbers
        app.setNumbers(input.nextInt());

        //output password to user
    }
}
