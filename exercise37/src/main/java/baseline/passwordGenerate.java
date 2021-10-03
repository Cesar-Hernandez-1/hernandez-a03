package baseline;

import java.util.Random;

public class passwordGenerate {
    //create int variable for length
    private int length;
    //create int variable for special char nums
    private int special;
    //create int variable for number of nums nums
    private int numbers;
    //create random number object to produce random number
    Random rand = new Random();
    //create lists of all english lowercase numbers and special characters (same legnth)

    public void setLength(int length){
        //set length variable
    }

    public void setSpecial(int special){
        //set special variable
    }

    public void setNumbers(int numbers){
        //set numbers variable
    }

    public String getPassword(){
        //define password string array of legnth of length variable to set characters to it

        //create string to convert password array to string for output

        //for number in special variable, pick random position using random num gen and bound of length
        //if position is null, set a special character at random to it

        //for number in numbers variable, pick random position using random num gen and bound of length
        //if position is null, set a number from 0 to 9 at random to it

        //for number of remaining empty elements, pick random position using random num gen and bound of length
        //if position is null, set a letter at random to it

        //convert string array to string and return it
    }
}
