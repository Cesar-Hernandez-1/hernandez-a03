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
        ArrayList<String> employeeData1 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data1 = new HashMap<>();
        employeeData1.add("John");
        employeeData1.add("Manager");
        employeeData1.add("2016-12-31");
        data1.put("Johnson", employeeData1);
        table.add(data1);

        ArrayList<String> employeeData2 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data2 = new HashMap<>();
        employeeData2.add("Tou");
        employeeData2.add("Software Engineer");
        employeeData2.add("2016-10-05");
        data2.put("Xiong", employeeData2);
        table.add(data2);

        ArrayList<String> employeeData3 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data3 = new HashMap<>();
        employeeData3.add("Michaela");
        employeeData3.add("District Manager");
        employeeData3.add("2015-12-19");
        data3.put("Michaelson", employeeData3);
        table.add(data3);

        ArrayList<String> employeeData4 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data4 = new HashMap<>();
        employeeData4.add("Jake");
        employeeData4.add("Programmer");
        employeeData4.add("");
        data4.put("Jacobson", employeeData4);
        table.add(data4);

        ArrayList<String> employeeData5 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data5 = new HashMap<>();
        employeeData5.add("Jacquelyn");
        employeeData5.add("DBA");
        employeeData5.add("");
        data5.put("Jackson", employeeData5);
        table.add(data5);

        ArrayList<String> employeeData6 = new ArrayList<>();
        HashMap<String, ArrayList<String>> data6 = new HashMap<>();
        employeeData6.add("Sally");
        employeeData6.add("Web Developer");
        employeeData6.add("2015-12-18");
        data6.put("Weber", employeeData6);
        table.add(data6);
    }

    public String getTable(String search){
        //create string variable to construct table in
        StringBuilder output = new StringBuilder();
        output.append("""
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                """);

        //Sort the list, by alphabetical order last name
        //for each position in list
        for(int i = 0; i < table.size()-1; i++){
            for(int j = 0; j < table.size()-1; j++){
                try{
                    //check current last name and next last name (keys) and determine what comes in alphabetical order
                    String employee1 = (String) table.get(j+1).keySet().toArray()[0];
                    String employee2 = (String) table.get(j).keySet().toArray()[0];
                    //if a swap should be made, swap the two employees in the list.
                    if(employee1.compareTo(employee2) < 0){
                        HashMap<String, ArrayList<String>> temp = table.get(j);
                        table.set(j, table.get(j+1));
                        table.set(j+1,temp);
                    }
                }catch (Exception e){
                    break;
                }
            }
        }

        //add strings of employee data to output string ONLY records that match the search string by
        //comparing the search string to the first or last name field.
        //elements in list are alphabetically sorted
        for(HashMap<String, ArrayList<String>> employee : table){
            String key = (String) employee.keySet().toArray()[0];
            if(key.contains(search) || employee.get(key).get(0).contains(search)){
                output.append(employee.get(key).get(0)).append(" ").append(key);
                output.append(" ".repeat(Math.max(0, (19 - employee.get(key).get(0).length() - key.length())))).append("|");
                output.append(" ").append(employee.get(key).get(1));
                output.append(" ".repeat(Math.max(0, (18 - employee.get(key).get(1).length())))).append("|");
                output.append(" ").append(employee.get(key).get(2)).append("\n");
            }
        }
        output.replace(output.length()-1, output.length(), "");

        //return table
        return output.toString();
    }
}
