package baseline;

public class Solution30 {

    public static void main(String[] args) {
        //create multiplicationTable class instance to use method
        multiplicationTable app = new multiplicationTable();

        //use makeTable method to make a multiplication table
        //Store table in String variable for output
        String output = app.makeTable();

        //output table to user.
        System.out.print(output);
    }
}
