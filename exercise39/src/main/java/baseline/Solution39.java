/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

public class Solution39 {

    public static void main(String[] args) {
        //create records class variable object to use methods
        records app = new records();

        //use method to construct and initialize starting table, unsorted
        app.initialize();

        //use getTable method to get output table as string and store return
        //string value from function to output string variable
        String output = app.getTable();

        //output to user
        System.out.println(output);
    }
}
