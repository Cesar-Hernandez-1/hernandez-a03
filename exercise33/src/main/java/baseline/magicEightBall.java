package baseline;

import java.util.Random;

public class magicEightBall {
    //initialize String array with answers of yes, no, maybe, and ask again
    private static final String [] answers = {"Yes.","No.","Maybe.","Ask again later."};
    // define a random number object instance
    private static final Random rand = new Random();

    public String answer(String question){
        //return answer from generating a random number and modding it by the size of String array
        return answers[Math.abs(question.length() + rand.nextInt()) % 4];
    }
}
