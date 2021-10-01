package baseline;

public class PaymentCalculator {
    //store user entered inputs
    private double balance;
    private double apr;
    private double monthlyPayment;


    public void setApr(double apr) {
        //set apr from user and divide value by 100
        this.apr = apr / 100;
    }

    public void setBalance(double balance) {
        //store user entered balance
        this.balance = balance;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        //set monthly payment amount
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff(){
        //calculate number of months
        //return -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //n is the number of months.
        //i is the daily rate (APR divided by 365).
        //b is the balance.
        //p is the monthly payment.

        double fraction = -1f/30;
        return Double.parseDouble(String.format("%.2f",(fraction) * Math.log(1 + balance / monthlyPayment *
                (1 - Math.pow((1 + (apr/365)),30))) / Math.log(1 + (apr/365))));
    }
}
