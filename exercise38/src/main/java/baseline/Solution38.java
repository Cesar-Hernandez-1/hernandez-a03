/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create filter class object to use methods
        filter app = new filter();

        //prompt user to enter numbers separated by spaces
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userNumbers = input.nextLine();

        //convert input string into array manually as per constraints
        //to not use system built-in features.

        //create character array of length of input string without space characters
        Character [] numberArray = new Character[userNumbers.replaceAll("\\s","").length()];

        //for reach character in input string that is numeric, put it in array
        //disregard white spaces
        int counter = 0;
        for(int i = 0; i < numberArray.length; i++, counter++){
            while(true){
                if(userNumbers.charAt(counter) != ' '){
                    numberArray[i] = userNumbers.charAt(counter);
                    break;
                }
                counter++;
            }
        }

        //create string output to hold output string
        StringBuilder output = new StringBuilder("The even numbers are ");

        //for each number in returned array from filterEvenNumbers method,
        //add it to output string separated by spaces
        for(Character number : app.filterEvenNumbers(numberArray)){
            output.append(number).append(" ");
        }
        output.setCharAt(output.length() - 1,'.');

        //output to user
        System.out.println(output);
    }
}
