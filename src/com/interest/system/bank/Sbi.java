package com.interest.system.bank;

public class Sbi implements Bank {
    public int getFdInterestRates() {
        return 5;
    }

    public int getLoanInterestRate() {
        return 12;
    }

    public void getEstimateFdInterestAmount(int amount) {
        float afterInterest = amount * (float) 0.05;
        afterInterest = afterInterest + (float) (amount);
        System.out.println("If the estimated amount is 20000 then you will get " + afterInterest + " after 1 year");
    }

    public void getEstimateLoanInterestAmount(int amount) {
        float afterInterest = amount * (float) 0.12;
        afterInterest = afterInterest + (float) (amount);
        System.out.println("If the estimated amount is 20000 then you will be paying total " + afterInterest + " within 1 year");
    }
}
