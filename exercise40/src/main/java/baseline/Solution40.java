/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution40 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create records class variable object to use methods
        records app = new records();

        //use method to construct and initialize starting table, unsorted
        app.initialize();

        //prompt user to enter a search string and store it in a string variable
        System.out.print("Enter a search string: ");
        String search = input.nextLine();

        //use getTable method to get output table of names with search string as string
        // send search string to method and store return
        //string value from function to output string variable
        String output = app.getTable(search);

        //output to user
        System.out.println("Results: \n");
        System.out.println(output);
    }
}
