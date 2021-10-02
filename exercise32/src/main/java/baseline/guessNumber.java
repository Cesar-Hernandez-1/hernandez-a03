package baseline;

public class guessNumber {

    //create random number class to get random number

    //create private int variable to hold random number
    //create private int guesses and initialize to 0 to increment number of user guesses
    //create private int max to hold max bound for random number
    //create private String to hold user answer if they want to play again

    public void setDifficulty(String difficulty){
        //while true
            //try to parse input string
            //if input a 1, set max to 10. If 2 then max to 100. If 3 then max to 1000
            //break

            //otherwise, output error message and ask user for integer input
    }

    private boolean isNumber(int guess){
        //if input guess is equal to the random number, return true, false otherwise
    }

    private void hint(int guess){
        //output if guess is too low or high from comparing input to actual number
    }

    public String play(){
        //set random number with max value from difficulty

        //prompt user to enter in their guess and increment number of guesses

        //while true
            //if guessed number is actual number, return message with number of guesses taken

            //else, increment guesses, display hint, and take user input for next guess
    }

    public void setPlay(String play){
        //set play string to input
    }

    public String getPlay(){
        //return play string variable
    }
}
