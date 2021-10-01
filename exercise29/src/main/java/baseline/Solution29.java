package baseline;

import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create investmentCalc instance to use class methods
        investmentCalc app = new investmentCalc();

        //get valid input from user
        System.out.print("What is the rate of return? ");
        app.setReturnRate(input.nextLine());

        //get amount of investment time in years to double initial interest
        String output = "It will take " + app.getInvestmentTime() + " years to double your initial investment";

        //output results to user
        System.out.println(output);
    }
}
