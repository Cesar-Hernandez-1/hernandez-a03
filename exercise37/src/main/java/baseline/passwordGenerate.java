package baseline;

import java.util.List;
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
    List<String> letters = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
    List<String> specialChars = List.of("\\", ".", "[", "]", "{", "}", "(", ")", "<", ">", "*",
            "+", "-", "=", "!", "?", "^", "$", "\"", ";", "/", ",", "#", "@", "!", "~");

    public void setLength(int length){
        //set length variable
        this.length = length;
    }

    public void setSpecial(int special){
        //set special variable
        this.special = special;
    }

    public void setNumbers(int numbers){
        //set numbers variable
        this.numbers = numbers;
    }

    public String getPassword(){
        //define password string array of length of length variable to set characters to it
        String [] password = new String[this.length];
        //create string to convert password array to string for output
        StringBuilder passwordString = new StringBuilder();

        //for number in special variable, pick random position using random num gen and bound of length
        //if position is null, set a special character at random to it
        for(int i = 0; i < special; i++){
            while(true){
                int position = rand.nextInt((length));
                if(password[position] == null){
                    password[position] = specialChars.get(rand.nextInt(specialChars.size()));
                    break;
                }
            }
        }

        //for number in numbers variable, pick random position using random num gen and bound of length
        //if position is null, set a number from 0 to 9 at random to it
        for(int i = 0; i < numbers; i++){
            while(true){
                int position = rand.nextInt((length));
                if(password[position] == null){
                    password[position] = String.valueOf(rand.nextInt(10));
                    break;
                }
            }
        }

        //for number of remaining empty elements, pick random position using random num gen and bound of length
        //if position is null, set a letter at random to it
        for(int i = 0; i < (length - (special + numbers)); i++){
            while(true){
                int position = rand.nextInt((length));
                if(password[position] == null){
                    password[position] = letters.get(rand.nextInt(letters.size()));
                    break;
                }
            }
        }

        //convert string array to string and return it
        for(String letter : password){
            passwordString.append(letter);
        }
        return passwordString.toString();
    }
}
