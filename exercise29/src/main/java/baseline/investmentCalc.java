/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class investmentCalc {
    private static final Scanner input = new Scanner(System.in);

    //have a double variable to hold user entered returnRate
    private double returnRate;
    //have boolean variable to flag if input is valid or not
    private boolean validInput = false;

        //Had to flip sections of code and add user input section.
    public void setReturnRate(String userReturnRate){
        //use while true loop to trap bad input, so can ensure that the user enters valid values.
        while (!validInput) {

            //try to case string input to double number
            try{
                this.returnRate = Double.parseDouble(userReturnRate);

                //if input number is less than or equal to 0, flag input as false.
                //Otherwise, flag input as valid
                validInput = (this.returnRate > 0);
            }catch (Exception e){
                //if casing resulted in an error, flag input as invalid.
                validInput = false;
            }

            //if input is invalid, output error message and loop again to test user for valid input.
            if(!validInput){
                System.out.println("Sorry. That's not a valid input.");

                //prompt user to enter the rate of return
                System.out.print("What is the rate of return? ");
                userReturnRate = input.nextLine();
            }
        }
    }

    public double getInvestmentTime(){
        //return computation of 72 over the entered return rate
        return 72 / returnRate;
    }
}
