/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create instance of class named PaymentCalculator to access its methods
        PaymentCalculator app = new PaymentCalculator();

        //Get balance from user
        app.setBalance(input.nextDouble());

        //Get APR from user
        app.setApr(input.nextDouble());

        //Get monthly payment amount from user
        app.setMonthlyPayment(input.nextDouble());

        //use calculateMonthsUntilPaidOff to get number of months until the debt is paid off
        app.calculateMonthsUntilPaidOff();

        //output number of months to user.
    }
}
