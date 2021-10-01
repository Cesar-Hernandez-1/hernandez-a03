package baseline;

public class numberAdder {
    //create double variable sum to hold running total
    private double sum;

    public void setSum(double number){
        //add number to current value of sum
        this.sum += number;
    }

    public double getSum(){
        //return value of sum
        return this.sum;
    }
}
