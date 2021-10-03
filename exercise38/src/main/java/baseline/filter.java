package baseline;

public class filter {

    public Character [] filterEvenNumbers(Character [] numberArray){
        //create new array with length of numbers that are even in input array to have no unused null elements
        Character [] newNumberArray = new Character[countEvens(numberArray)];

        //traverse through input array and put even numbers (number mod 2 = 0)
        //into the new array (that is just the right size)
        //Change from pseudocode: removed leaving new array with null elements and now makes perfect size array
        int counter = 0;
        for (Character character : numberArray) {
            if ((Integer.parseInt(String.valueOf(character)) % 2) == 0) {
                newNumberArray[counter] = character;
                counter++;
            }
        }
        //return new array
        return newNumberArray;
    }

    //for each element in input array, if number mod 2 is 0
    //then increment a counter
    //change from pseudocode: took out for loop that only put in even numbers into an
    //array of same size of input and dynamically makes a correct size array.
    private int countEvens(Character [] numberArray){
        int numberOfEvens = 0;
        for(Character number : numberArray){
            if((Integer.parseInt(String.valueOf(number)) % 2) == 0){
                numberOfEvens++;
            }
        }
        return numberOfEvens;
    }
}
