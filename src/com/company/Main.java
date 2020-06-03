package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("final price with interest is "+calculateInterest(40000.00,6.99));
    }
    public static double calculateInterest(double amount,double interestRate ){
        return (amount+amount*(interestRate/100));
    }
}
