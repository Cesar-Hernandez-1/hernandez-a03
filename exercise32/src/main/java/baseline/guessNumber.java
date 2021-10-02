package baseline;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    private static final Scanner input = new Scanner(System.in);

    //create random number class to get random number
    private static final Random rand = new Random();

    //create private int variable to hold random number
    private int number;
    //create private int guesses and initialize to 0 to increment number of user guesses
    private int guesses = 0;

    public void setDifficulty(String difficulty){
        //while true
        while(true){
            //try to parse input string
            try{

                int difficulty1 = Integer.parseInt(difficulty);
                //if input a 1, set max to 10. If 2 then max to 100. If 3 then max to 1000
                int max;
                if(difficulty1 == 1){
                    max = 10;
                }else if (difficulty1 == 2){
                    max = 100;
                }else {
                    max = 1000;
                }

                //set random number with max value from difficulty
                number = rand.nextInt(max);
                //prompt user to enter in their guess and increment number of guesses
                System.out.print("I have my number. What's your guess? ");
                //break
                break;
            }//otherwise, output error message and ask user for integer input
            catch (Exception e){
                System.out.println("Inputted non-numeric data. Enter numeric data.");
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = input.nextLine();
            }
        }
    }

    public String play(int guess){
        //increment number of guesses user takes
        guesses++;

        //if guessed number is actual number, return message with number of guesses taken
        if(guess == number){
            return ("You got it in " + guesses + " guesses!");
        }else{
            //else, increment guesses, display hint, and take user input for next guess
            System.out.print((guess < number ? ("Too low.") : ("Too high.")) + " Guess again: ");
        }
        //if number not guessed, return empty string
        return "";
    }
}
