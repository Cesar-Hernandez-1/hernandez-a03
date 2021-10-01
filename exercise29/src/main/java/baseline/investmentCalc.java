package baseline;

import java.util.Scanner;

public class investmentCalc {
    private static final Scanner input = new Scanner(System.in);

    //have a double variable to hold user entered returnRate
    //have boolean variable to flag if input is valid or not

    public void setReturnRate(){
        //use while true loop to trap bad input, so can ensure that the user enters valid values.

        //prompt user to enter the rate of return

        //try to case string input to double number
        //if input number is less than or equal to 0, flag input as false.
        //Otherwise, flag input as valid

        //if casing resulted in an error, flag input as invalid.

        //if input is invalid, output error message and loop again to ask user for valid input.
    }

    public double getInvestmentTime(){
        //return computation of 72 over the entered return rate
    }
}
