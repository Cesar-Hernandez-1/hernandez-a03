package baseline;

public class passwordEvaluate {

    private boolean isVeryWeak(String password){
        //determine if password is less than 8 characters (short)

        //count numbers in password and determine if only numbers are present

        //return true if password has only numbers and is short
    }

    private boolean isWeak(String password){
        //determine if password is less than 8 characters (short)

        //count letters in password and determine if only letters are present

        //return true if password is short and only letters are present
    }

    private boolean isStrong(String password){
        //determine if password is equal to or greater than 8 characters (long)

        //determine if password has only one number, has at least one letter, and has no special characters

        //return true if password is long, has one letter, has at least one letter, and has no special characters
    }

    private boolean isVeryStrong(String password){
        //determine is password is equal or greater than 8 characters (long)

        //determine if password has numbers, letters, and special characters

        //return true if password is long and has numbers, letters, and spacial characters
    }

    public int passwordValidator(String password){
        //return integer based on strength of password
        //Strength of password evaluated by private functions
        if(isVeryWeak(password)){
            //return 1 for very weak
        }else if(isWeak(password)){
            //return 2 for weak
        }else if(isStrong(password)){
            //return 3 for strong
        }else if(isVeryStrong(password)){
            //return 4 for very strong
        }
        //return 5 if nothing picks up
    }
}
