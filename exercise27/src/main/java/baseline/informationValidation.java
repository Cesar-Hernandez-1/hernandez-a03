package baseline;

public class informationValidation {
    //create string to collect error messages
    private static final StringBuilder bld = new StringBuilder();

    private void validateFirstName(String firstName){
        //if firstName length is less than 2, add error message
        //if the length is 0, add another error message
        if(firstName.length() < 2){
            bld.append("The first name must be at least 2 characters long.\n");
            if(firstName.length() == 0){
                bld.append("The first name must be filled in.\n");
            }
        }
    }

    private void validateLastName(String lastName){
        //if lastName length is less than 2, add error message
        //if the length is 0, add another error message
        if(lastName.length() < 2){
            bld.append("The last name must be at least 2 characters long.\n");
            if(lastName.length() == 0){
                bld.append("The last name must be filled in.\n");
            }
        }
    }

    private void validateZipCode(String zipCode){
        //if zipCode length not equal to 5, add error message
        //otherwise, check each character. If one is an alphabet character, add error message
        if(zipCode.length() != 5){
            bld.append("The zipcode must be a 5 digit number.\n");
        }else{
            for(int i = 0; i < zipCode.toCharArray().length; i++){
                if(!Character.isDigit(zipCode.toCharArray()[i])){
                    bld.append("The zipcode must be a 5 digit number.\n");
                    break;
                }
            }
        }
    }

    private void validateEmployeeID(String employeeID){
        String error = "The employee ID must be in the format of AA-1234.\n";
        if(employeeID.length() != 7){
            //if employeeID not 7 characters in length, add error message.
            bld.append(error);
        }else{
            //Otherwise, check if first two characters are an alphabet character
            //           check if third character is a hyphen
            //           check if last four characters are numeric characters
            //      if any of the previous tests fail, add an error message
            if(!Character.isAlphabetic(employeeID.toCharArray()[0]) || !Character.isAlphabetic(employeeID.toCharArray()[1])){
                bld.append(error);
            }else if(employeeID.toCharArray()[2] != '-'){
                bld.append(error);
            }else{
                for(int i = 3; i < employeeID.toCharArray().length; i++){
                    if(!Character.isDigit(employeeID.toCharArray()[i])){
                        bld.append(error);
                        break;
                    }
                }
            }
        }
    }

    private void validateNoErrors(){
        //if no errors were detected, then the string variable is empty.
        //So, add a message that no errors were found.
        if(bld.isEmpty()){
            bld.append("There were no errors found.");
        }
    }

    public String validateInput(String firstName, String lastName, String zipCode, String employeeID){
        //use defined functions to validate
        //          firstname
        validateFirstName(firstName);
        //          lastName
        validateLastName(lastName);
        //          employeeID
        validateEmployeeID(employeeID);
        //          zipCode
        validateZipCode(zipCode);
        //          and check if there were no errors
        validateNoErrors();
        // reset the string to work on another set of inputs
        String output = bld.toString();
        bld.setLength(0);
        //return error messages
        return output;
    }
}
