package baseline;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create filter class object to use methods
        filter app = new filter();

        //prompt user to enter numbers separated by spaces
        String userNumbers = input.nextLine();

        //convert input string into array manually as per constraints
        //to not use system built-in features.

        //create character array of length of input string without space characters

        //for reach character in input string that is numeric, put it in array
        //disregard white spaces

        //for each number in returned array from filterEvenNumbers method,
        //add it to output string separated by spaces
        for(Character number : app.filterEvenNumbers(numberArray)){
            output.append(number).append(" ");
        }

        //output to user

    }
}
