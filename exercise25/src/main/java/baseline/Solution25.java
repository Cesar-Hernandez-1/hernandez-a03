/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //class to hold helper methods.
        passwordEvaluate app = new passwordEvaluate();

        //prompt user to enter a password and store input in string variable
        System.out.print("Enter a password to determine it's strength: ");
        String output = input.nextLine();

        //Send password to passwordValidator method determines strength of password parameter
        //returns integer to evaluate strength.
        int strength = app.passwordValidator(output);

        //evaluate strength of password
        if(strength == 1){
            //password is very weak
            output += " is a very weak password.";
        }else if(strength == 2){
            //password is weak
            output += " is a weak password.";
        }else if(strength == 3){
            //password is strong
            output += " is a strong password.";
        }else if(strength == 4){
            //password is very strong
            output += " is a very strong password.";
        }else{
            //output is unknown strength
            output += " is of unknown strength.";
        }

        //output results to user
        output = "The password " + output;
        System.out.println(output);
    }
}
