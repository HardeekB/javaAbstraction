package com.interestSystem.bank;

public interface Bank {
    int getFdInterestRates();

    int getLoanInterestRate();

    void getEstimateFdInterestAmount(int a);

    void getEstimateLoanInterestAmount(int a);
}
