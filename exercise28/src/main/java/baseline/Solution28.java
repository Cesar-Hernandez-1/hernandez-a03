/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create instance of numberAdder class to use class functions
        numberAdder app = new numberAdder();

        //prompt user for 5 numbers, using for loop for repetition
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            app.setSum(input.nextDouble());
        }

        //compute total of the numbers
        String output = "The total is " + app.getSum() + ".";

        //output sum to user
        System.out.println(output);
    }
}
