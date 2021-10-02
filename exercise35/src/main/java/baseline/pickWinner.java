package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pickWinner {
    //create private list of strings to hold names
    private final List<String> people = new ArrayList<>();
    //create random number generator object to get random number
    private final Random rand = new Random();

    public void addName(String name){
        //use list method to add name to string list
        people.add(name);
    }

    public String getWinner(){
        //use string list get method on index of random number mod the size of the String list
        return people.get(Math.abs(rand.nextInt() % people.size()));
    }
}
