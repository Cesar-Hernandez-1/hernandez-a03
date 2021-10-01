package baseline;

public class Solution29 {
    public static void main(String[] args) {
        //create investmentCalc instance to use class methods
        investmentCalc app = new investmentCalc();

        //get valid input from user
        app.setReturnRate();

        //get amount of investment time in years to double initial interest
        app.getInvestmentTime();

        //output results to user
    }
}
