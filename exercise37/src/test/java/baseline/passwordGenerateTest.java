package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordGenerateTest {

    @Test
    void getPassword() {
        passwordGenerate app = new passwordGenerate();
        int numbers = 0;
        int specials = 0;
        int letters = 0;

        app.setLength(8);
        app.setSpecial(2);
        app.setNumbers(2);
        String output = app.getPassword();

        for(int i = 0; i < output.length(); i++){
            if(Character.isDigit(output.charAt(i))){
                numbers++;
            }else if(Character.isAlphabetic(output.charAt(i))){
                letters++;
            }else{
                specials++;
            }
        }

        assertEquals(2, specials);
        assertEquals(2, numbers);
        assertEquals(8, letters + specials + numbers);
    }
}