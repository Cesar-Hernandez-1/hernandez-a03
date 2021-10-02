/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution34 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create employeeRemove class instance to use methods
        employeeRemove app = new employeeRemove();

        //display all employees to user
        System.out.print(app.displayEmployees());

        //prompt user to enter name to remove an employee from the list
        System.out.print("Enter an employee name to remove: ");
        app.removeEmployee(input.nextLine());

        //display list of employees after removal
        System.out.print(app.displayEmployees());
    }
}
