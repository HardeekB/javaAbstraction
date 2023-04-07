package com.interest.system;

import com.interest.system.bank.Hdfc;
import com.interest.system.bank.Sbi;


public class Customer {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        Hdfc hdfc = new Hdfc();
        int estimateAmount = 20000;
        int sbiFdRate = sbi.getFdInterestRates();
        int sbiLoanRate = sbi.getLoanInterestRate();
        System.out.println("-------------------------------------------------");
        System.out.println("Welcome to SBI !!!!!");
        System.out.println("Current Fixed Deposits rates: " + sbiFdRate + "%");
        System.out.println("Current Loan rates: " + sbiLoanRate + "%");
        sbi.getEstimateFdInterestAmount(estimateAmount);
        sbi.getEstimateLoanInterestAmount(estimateAmount);
        System.out.println("Thank you for visiting SBI");
        System.out.println("-------------------------------------------------");
        int hdfcFdRate = hdfc.getFdInterestRates();
        int hdfcLoanRate = hdfc.getLoanInterestRate();
        System.out.println("Welcome to HDFC !!!!!");
        System.out.println("Current Fixed Deposits rates: " + hdfcFdRate + "%");
        System.out.println("Current Loan rates: " + hdfcLoanRate + "%");
        hdfc.getEstimateFdInterestAmount(estimateAmount);
        hdfc.getEstimateLoanInterestAmount(estimateAmount);
        System.out.println("Thank you for visiting HDFC");
        System.out.println("-------------------------------------------------");

    }
}