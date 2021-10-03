package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class records {
    //create list of maps to hold data of each employee, final because it is the only one
    private static final List<HashMap<String, ArrayList<String>>> table = new ArrayList<>();

    public void initialize(){
        //create each employee by creating an array list
        //and placing employee first name, job, and separation date in it
        //make lastname the key in the list
        //place employee in list by making lastname as key and the array list of other data as data
    }

    public String getTable(){
        //create string variable to construct table in
        StringBuilder output = new StringBuilder();

        //Sort the list, by alphabetical order last name

        //for each position in list
        //check current last name and next last name (keys) and determine what comes in alphabetical order
        //if a swap should be made, swap the two employees in the list.

        //add strings of employee data to output string variable in list position order
        //as list is now alphabetically sorted

        //return the table
    }

}
