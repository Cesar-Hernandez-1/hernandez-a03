package baseline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordEvaluate {

    private boolean isVeryWeak(String password){
        //determine if password is less than 8 characters (short)
        boolean isShort = password.length() < 8;

        //count numbers in password and determine if only numbers are present
        boolean onlyNumbers = true;
        for(int i = 0; i < password.toCharArray().length; i++) {
            if (!Character.isDigit(password.toCharArray()[i])) {
                onlyNumbers = false;
                break;
            }
        }

        //return true if password has only numbers and is short
        return (isShort && onlyNumbers);
    }

    private boolean isWeak(String password){
        //determine if password is less than 8 characters (short)
        boolean isShort = password.length() < 8;

        //count letters in password and determine if only letters are present
        boolean onlyLetters = true;
        for(int i = 0; i < password.toCharArray().length; i++) {
            if (!Character.isAlphabetic(password.toCharArray()[i])) {
                onlyLetters = false;
                break;
            }
        }

        //return true if password is short and only letters are present
        return (isShort && onlyLetters);
    }

    private boolean isStrong(String password){
        //determine if password is equal to or greater than 8 characters (long)
        boolean isLong = password.length() >= 8;

        //determine if password has only one number, has at least one letter, and has no special characters
        boolean oneNumber = false;
        boolean hasLetters = false;
        boolean hasSpecial;
        Pattern special = Pattern.compile("[!@#$%^&*()_+=|<>?{}\\[\\]~-]");
        Matcher specialCharacter = special.matcher(password);
        hasSpecial = specialCharacter.find();

        for(int i = 0; i < password.toCharArray().length; i++) {
            if (Character.isDigit(password.toCharArray()[i]) && !oneNumber) {
                oneNumber = true;
            }else if(Character.isAlphabetic(password.toCharArray()[i]) && !hasLetters){
                hasLetters = true;
            }
        }

        //return true if password is long, has one letter, has at least one letter, and has no special characters
        return (isLong && oneNumber && hasLetters && !hasSpecial);
    }

    private boolean isVeryStrong(String password){
        //determine is password is equal or greater than 8 characters (long)
        boolean isLong = password.length() >= 8;

        //determine if password has numbers, letters, and special characters
        boolean hasNumbers = false;
        boolean hasLetters = false;
        boolean hasSpecial;
        Pattern special = Pattern.compile("[!@#$%^&*()_+=|<>?{}\\[\\]~-]");
        Matcher specialCharacter = special.matcher(password);
        hasSpecial = specialCharacter.find();

        for(int i = 0; i < password.toCharArray().length; i++) {
            if (Character.isDigit(password.toCharArray()[i]) && !hasNumbers) {
                hasNumbers = true;
            }else if(Character.isAlphabetic(password.toCharArray()[i]) && !hasLetters){
                hasLetters = true;
            }
        }

        //return true if password is long and has numbers, letters, and spacial characters
        return (isLong && hasNumbers && hasLetters && hasSpecial);
    }

    public int passwordValidator(String password){
        //return integer based on strength of password
        //Strength of password evaluated by private functions
        if(isVeryWeak(password)){
            //return 1 for very weak
            return 1;
        }else if(isWeak(password)){
            //return 2 for weak
            return 2;
        }else if(isStrong(password)){
            //return 3 for strong
            return 3;
        }else if(isVeryStrong(password)){
            //return 4 for very strong
            return 4;
        }
        //return 5 if nothing picks up
        return 5;
    }
}
