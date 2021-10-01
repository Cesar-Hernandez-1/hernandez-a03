package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //class to hold helper methods.
        passwordEvaluate app = new passwordEvaluate();

        //prompt user to enter a password and store input in string variable
        String output = input.nextLine();

        //Send password to passwordValidator method determines strength of password parameter
        //returns integer to evaluate strength.
        int strength = app.passwordValidator(output);

        //evaluate strength of password
        if(strength == 1){
            //password is very weak
        }else if(strength == 2){
            //password is weak
        }else if(strength == 3){
            //password is strong
        }else if(strength == 4){
            //password is very strong
        }else{
            //output is unknown strength
        }

        //output results to user
    }
}
