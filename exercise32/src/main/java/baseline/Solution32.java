/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Objects;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //create guessNumber instance to use methods
        guessNumber app = new guessNumber();

        //String variable to hold number of guesses output to show user
        String output = "";

        //do
        do{
            //prompt user that they will play a number guessing game
            System.out.println("Let's play Guess the Number!\n");

            //prompt user to enter difficulty as integer
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            app.setDifficulty(input.nextLine());

            //call method to play game that returns number of guesses, accepts integer
            while(Objects.equals(output, "")){
                output = app.play(Integer.parseInt(input.nextLine()));
            }

            //output number of guesses of the correct number to user
            System.out.print(output);

            //ask user if they want to play again Y for yes or N for no
            System.out.print("\n\nDo you wish to play again (Y/N)? ");
        }while(Objects.equals(input.nextLine(), "y"));
        //while user enters "Y", continue playing

    }
}
