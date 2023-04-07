package com.interest.system.bank;

public class Hdfc implements Bank {
    public int getFdInterestRates() {
        return 6;
    }

    public int getLoanInterestRate() {
        return 11;
    }

    public void getEstimateFdInterestAmount(int amount) {
        float afterInterest = amount * (float) 0.06;
        afterInterest = afterInterest + (float) (amount);
        System.out.println("If the estimated amount is 20000 then you will get " + afterInterest + " after 1 year");
    }

    public void getEstimateLoanInterestAmount(int amount) {
        float afterInterest = amount * (float) 0.11;
        afterInterest = afterInterest + (float) (amount);
        System.out.println("If the estimated amount is 20000 then you will be paying total " + afterInterest + " within 1 year");
    }
}
