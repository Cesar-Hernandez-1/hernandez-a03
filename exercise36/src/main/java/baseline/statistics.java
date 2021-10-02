package baseline;

import java.util.List;

public class statistics {
    //create private double variable to hold average
    private double average;

    public double average(List<Double> numbers){
        //for each number in list, add to running total to average variable
        for (Double number : numbers) {
            this.average += number;
        }
        //average is assigned a value of itself divided by the numbers list length
        average /= numbers.size();
        //return average
        return average;
    }

    public double max(List<Double> numbers){
        //set double variable to hold first element in list
        double maximum = numbers.get(0);
        //for each number in list. compare to temp highest value.
        for(double currentNum : numbers){
            //if current number is higher, make it new highest
            if(currentNum > maximum){
                maximum = currentNum;
            }
        }
        //return maximum
        return maximum;
    }

    public double min(List<Double> numbers){
        //set double variable to hold first element in list
        double minimum = numbers.get(0);
        //for each number in list. compare to temp lowest value.
        for(double currentNum : numbers){
            //if current number is lower, make it new lowest
            if(currentNum < minimum){
                minimum = currentNum;
            }
        }
        //return minimum
        return minimum;
    }

    public double std(List<Double> numbers){
        //set numerator double variable to zero
        double numerator = 0;
        //for each number in list, sum a running total of the current value minus the average all squared
        for(double currentNum : numbers){
            numerator += Math.pow(Math.abs(currentNum - this.average),2);
        }
        //return the square root of the numerator divided by the size of the list.
        return Math.sqrt(numerator / numbers.size());
    }
}
