/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Objects;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create pickWinner class instance object to use methods
        pickWinner app = new pickWinner();

        //while true
        while(true){
            //prompt user to enter a name
            System.out.print("Enter a name: ");
            String name = input.nextLine();

            //if string entered is empty, break
            if(Objects.equals(name, "")){
                break;
            }
            //else, use method to add name
            else{
                app.addName(name);
            }
        }
        //get name of winner from method
        String output = "The winner is... " + app.getWinner();

        //output winner to user
        System.out.println(output);
    }
}
