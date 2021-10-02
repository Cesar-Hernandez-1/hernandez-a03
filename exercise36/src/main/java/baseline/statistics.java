package baseline;

import java.util.List;

public class statistics {
    //create private double variable to hold average

    public double average(List<Double> numbers){
        //for each number in list, add to running total to average variable

        //average is assigned a value of itself divided by the numbers list length

        //return average
    }

    public double max(List<Double> numbers){
        //set double variable to hold first element in list

        //for each number in list. compare to temp highest value.
        //if current number is higher, make it new highest

        //return maximum
    }

    public double min(List<Double> numbers){
        //set double variable to hold first element in list

        //for each number in list. compare to temp lowest value.
        //if current number is lower, make it new lowest

        //return minimum
    }

    public double std(List<Double> numbers){
        //set numerator double variable to zero

        //for each number in list, sum a running total of the current value minus the average all squared

        //return the square root of the numerator divided by the size of the list.
    }
}
