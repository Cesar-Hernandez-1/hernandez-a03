/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.util.Scanner;

public class Solution24 {
    //create scanner "input" to handle user input
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create instance of class to use functions
        anagramHelp app = new anagramHelp();

        //prompt to enter two strings
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        //prompt to get first string from user
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        //prompt to get second string from user
        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        //Construct output string
        String output = "\"" + word1 + "\"" + " and \"" + word2 + "\" are ";

        //Pass both words to the function isAnagram.
        //If both words are an anagram, the function returns true.
        //Function returns false if the words are not an anagram.
        //add "not" to output if returned boolean is false.
        if(!app.isAnagram(word1, word2)){
            output += "not ";
        }

        //add "anagrams" to output string
        output += "anagrams";

        //output data
        System.out.println(output);
    }


}
