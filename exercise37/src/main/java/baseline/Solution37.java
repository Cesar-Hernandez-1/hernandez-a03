/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // create passwordGenerate class object to use methods
        passwordGenerate app = new passwordGenerate();

        //prompt user to input minimum length
        System.out.print("What's the minimum length? ");
        app.setLength(input.nextInt());

        //prompt user to enter number of special characters
        System.out.print("How many special characters? ");
        app.setSpecial(input.nextInt());

        //prompt user number of numbers
        System.out.print("How many numbers? ");
        app.setNumbers(input.nextInt());

        //output password to user
        String output = "Your password is " + app.getPassword();
        System.out.println(output);
    }
}
