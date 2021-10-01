/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create informationValidation class to access helper methods
        informationValidation app = new informationValidation();

        //initialize String variables to hold user input of first/last name,
        //zipcode, employeeID, and output.
        String firstName;
        String lastName;
        String zipCode;
        String employeeID;
        String output;

        //Get first name from user
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

        //get last name from user
        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

        //get zipcode from user
        System.out.print("Enter the ZIP code: ");
        zipCode = input.nextLine();

        //get employeeID from user
        System.out.print("Enter the employee ID: ");
        employeeID = input.nextLine();

        //Determine validation message from validateInput method
        output = app.validateInput(firstName, lastName, zipCode, employeeID);

        //output results to user
        System.out.println(output);
    }
}
