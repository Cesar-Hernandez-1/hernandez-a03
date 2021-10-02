package baseline;

import java.util.Arrays;
import java.util.Objects;

public class employeeRemove {
    //create string array to store names
    private String [] employees = new String[] {"John Smith", "Jackie Jackson", "Chris Jones",
            "Amanda Cullen", "Jeremy Goodwin"};

    public String displayEmployees(){
        StringBuilder output = new StringBuilder();
        //display number of employees in list
        output.append("There are ").append(employees.length).append(" employees:\n");
        //print names of employees in enhanced for loop
        for(String employee : employees){
            if(Objects.equals(employee, "")){
                break;
            }
            output.append(employee).append("\n");
        }
        return output.toString();
    }

    public void removeEmployee(String employee){
        //create new array object
        String [] temp = new String[this.employees.length - 1];

        //use for loop to traverse array, add name to new array
        //object except for if the name in the class instance array
        //match the input name
        int j = 0;
        for (String s : this.employees) {
            if (!Objects.equals(s, employee)) {
                temp[j++] = s;
            }
        }
        //the class instance's array is now the new array object.
        this.employees = temp;
    }
}
