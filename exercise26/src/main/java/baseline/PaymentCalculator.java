package baseline;

public class PaymentCalculator {
    //store user entered inputs
    private double balance;
    private double apr;
    private double monthlyPayment;


    public void setApr(double apr) {
        //set apr from user and divide value by 100
    }

    public void setBalance(double balance) {
        //store user entered balance
    }

    public void setMonthlyPayment(double monthlyPayment) {
        //set monthly payment amount
    }

    public double calculateMonthsUntilPaidOff(){
        //calculate number of months
        //return -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //n is the number of months.
        //i is the daily rate (APR divided by 365).
        //b is the balance.
        //p is the monthly payment.
    }
}
