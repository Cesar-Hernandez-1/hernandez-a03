package baseline;

public class Solution32 {
    //create guessNumber instance to use methods
    guessNumber app = new guessNumber();

    //do

        //prompt user that they will play a number guessing game
        app.setDifficulty(input.nextLine());

        //prompt user to enter difficulty as integer

        //call method to play game that returns number of guesses
        app.play();

        //output number of guesses of the correct number to user

        //ask user if they want to play again Y for yes or N for no
        app.setPlay(input.nextLine());

    //while user enters "Y", continue playing
}
