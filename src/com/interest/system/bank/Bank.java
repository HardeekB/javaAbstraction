package com.interest.system.bank;

public interface Bank {
    int getFdInterestRates();

    int getLoanInterestRate();

    void getEstimateFdInterestAmount(int a);

    void getEstimateLoanInterestAmount(int a);
}
