/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

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
    firstName = input.nextLine();

    //get last name from user
    lastName = input.nextLine();

    //get zipcode from user
    zipCode = input.nextLine();

    //get employeeID from user
    employeeID = input.nextLine();

    //Determine validation message from validateInput method
    output = app.validateInput(firstName, lastName, zipCode, employeeID);

    //output results to user
}
