package baseline;

import java.util.Scanner;

public class karvonenHeartRate {
    private static final Scanner input = new Scanner(System.in);

    //String variable to build table
    private static final StringBuilder table = new StringBuilder();
    //create double variable to hold resting HR
    private double restingHR;
    //create double variable to hold age variable
    private double age;

    public void setAge(String age){
        //while true
        while(true){
            try{
                //try to case string input to a double number and set to age variable, break
                this.age = Double.parseDouble(age);
                break;
            }catch (Exception e){
                //otherwise, display error and ask user for age as a number
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Age: ");
                age = input.nextLine();
            }
        }
    }

    public void setRestingHR(String restingHR){
        //while true
        while(true){
            try{
                //try to case string input to a double number and set to resting HR variable, break
                this.restingHR = Double.parseDouble(restingHR);
                break;
            }catch (Exception e){
                //otherwise, display error and ask user for age as a number
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Resting Pulse: ");
                restingHR = input.nextLine();
            }
        }
    }

    private int targetHeartRate(int intensity){
        //return (((220 - age) - resting HR) * (intensity / 100)) + resting HR
        return (int)((((220 - this.age) - this.restingHR) * ((double) intensity /100)) + this.restingHR);
    }

    //change from pseudocode commit: changed return from void to String to return table string
    public String displayTable(){
        //build table in string variable
        //add heading and line formats to string
        table.append("Intensity    | Rate\n");
        table.append("-------------|--------\n");

        //iterate intensity from 55 to 95 by 5 and add intensity and value of target heart rate for given
        //intensity and data entered.
        for (int i = 55; i < 96; i += 5){
            table.append(i).append("%          | ").append(targetHeartRate(i)).append(" bpm\n");
        }
        table.replace(table.length() - 1, table.length(), "");

        //return table string
        return table.toString();
    }
}
