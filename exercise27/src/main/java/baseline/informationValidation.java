package baseline;

public class informationValidation {
    //create string to collect error messages

    private void validateFirstName(String firstName){
        //if firstName length is less than 2, add error message
        //if the length is 0, add another error message
    }

    private void validateLastName(String lastName){
        //if lastName length is less than 2, add error message
        //if the length is 0, add another error message
    }

    private void validateZipCode(String zipCode){
        //if zipCode length not equal to 5, add error message
        //otherwise, check each character. If one is an alphabet character, add error message
    }

    private void validateEmployeeID(String employeeID){
        //if employeeID not 7 characters in length, add error message.
        //Otherwise, check if first two characters are an alphabet character
        //           check if third character is a hyphen
        //           check if last four characters are numeric characters
        //      if any of the previous tests fail, add an error message
    }

    private void validateNoErrors(){
        //if no errors were detected, then the string variable is empty.
        //So, add a message that no errors were found.
    }

    public String validateInput(String firstName, String lastName, String zipCode, String employeeID){
        //use defined functions to validate
        //          firstname
        //          lastName
        //          employeeID
        //          zipCode
        //          and check if there were no errors
        // reset the string to work on another set of inputs
        //return error messages
    }
}
