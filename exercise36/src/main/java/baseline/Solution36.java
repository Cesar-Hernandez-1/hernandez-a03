/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner input = new Scanner(System.in);

    //create double list to hold numbers
    private static final List<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        //create statistics class instance object to utilize methods
        statistics app = new statistics();

        //create string variable to hold user number
        String userNumber;
        //Create string variable to hold output
        StringBuilder output;

        //while true
        while(true){
            //prompt user for number
            System.out.print("Enter a number: ");
            userNumber = input.nextLine();

            //if user input is "done", break
            if(Objects.equals(userNumber, "done")){
                break;
            }

            //try to use method function to add double case input to list
            //if error happens, ignore
            try{
                numbers.add(Double.parseDouble(userNumber));
            }catch (Exception ignore){
                System.out.print("");
            }
        }

        //use enhanced for loop to add all numbers to output string
        output = new StringBuilder("Numbers: ");
        //for the number in the list, add number and new line to output string
        for(double number : numbers){
            if(number == numbers.get(numbers.size() - 1)){
                output.append(number).append("\n");
                break;
            }
            output.append(number).append(", ");
        }

        //use average method and send list to method to get average and add it to output string
        output.append("The average is ").append(app.average(numbers)).append("\n");
        //send numbers list to min method to get minimum number
        output.append("The minimum is ").append(app.min(numbers)).append("\n");
        //send numbers list to max method to get maximum number
        output.append("The maximum is ").append(app.max(numbers)).append("\n");
        //send numbers list to std method to get standard deviation
        output.append("The standard deviation is ").append(Double.parseDouble(String.format("%.2f",app.std(numbers))));

        //output to user
        System.out.println(output);
    }

}
