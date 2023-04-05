interface bank{
    int getFdInterestRates();
    int getLoanInterestRate();
    void getEstimateFdInterestAmount(int a);
    void getEstimateLoanInterestAmount(int a);
}


class hdfc implements bank{
    public int getFdInterestRates(){
        return 6;
    }
    public int getLoanInterestRate(){
        return 11;
    }
    public void getEstimateFdInterestAmount(int amount){
        float afterInterest = amount * (float)0.06;
        afterInterest = afterInterest+(float)(amount);
        System.out.println("If the estimated amount is 20000 then you will get "+ afterInterest  + " after 1 year");
    }
    public void getEstimateLoanInterestAmount(int amount){
        float afterInterest = amount * (float)0.11;
        afterInterest = afterInterest+(float)(amount);
        System.out.println("If the estimated amount is 20000 then you will be paying total "+ afterInterest  + " within 1 year");
    }
}
class sbi implements bank{
    public int getFdInterestRates(){
        return 5;
    }
    public int getLoanInterestRate(){
        return 12;
    }
     public void getEstimateFdInterestAmount(int amount){
         float afterInterest = amount * (float) 0.05;
         afterInterest = afterInterest+(float)(amount);
        System.out.println("If the estimated amount is 20000 then you will get "+ afterInterest + " after 1 year");
    }
    public void getEstimateLoanInterestAmount(int amount){
        float afterInterest = amount * (float)0.12;
        afterInterest = afterInterest + (float)(amount);
        System.out.println("If the estimated amount is 20000 then you will be paying total "+ afterInterest  + " within 1 year");
    }
}

public class customer{
    public static void main(String[] args) {
        sbi sbi = new sbi();
        hdfc hdfc = new hdfc();
        int estimateAmount = 20000;
        int sbiFdRate = sbi.getFdInterestRates();
        int sbiLoanRate = sbi.getLoanInterestRate();
        System.out.println("-------------------------------------------------");
        System.out.println("Welcome to SBI !!!!!");
        System.out.println("Current Fixed Deposits rates: "+ sbiFdRate + "%");
        System.out.println("Current Loan rates: "+ sbiLoanRate + "%");
        sbi.getEstimateFdInterestAmount(estimateAmount);
        sbi.getEstimateLoanInterestAmount(estimateAmount);
        System.out.println("Thank you for visiting SBI");
        System.out.println("-------------------------------------------------");
        int hdfcFdRate = hdfc.getFdInterestRates();
        int hdfcLoanRate = hdfc.getLoanInterestRate();
        System.out.println("Welcome to HDFC !!!!!");
        System.out.println("Current Fixed Deposits rates: "+ hdfcFdRate + "%");
        System.out.println("Current Loan rates: "+ hdfcLoanRate + "%");
        hdfc.getEstimateFdInterestAmount(estimateAmount);
        hdfc.getEstimateLoanInterestAmount(estimateAmount);
        System.out.println("Thank you for visiting HDFC");
        System.out.println("-------------------------------------------------");

    }
}