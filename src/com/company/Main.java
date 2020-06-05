package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println
                ("final price with interest is " + calculateInterest(40000.00, 12));
        System.out.println
                ("final price with interest is " + calculateInterest(10000.00, 2.0));
        System.out.println
                ("final price with interest is " + calculateInterest(36999, 5.0));
        System.out.println
                ("final price with interest is " + calculateInterest(39900.00, 6.99));

        /*for (int i = 0; i < 5; i++) {
            System.out.println("loop" + i + "= hello");}*/

        /*to calculate interest on $10,000 with interst rate 2,3,4,5,6,7,8.
        and to print results in console*/

        for (int i = 2; i < 9; i++) {
            System.out.println("interest on $10,000 with interest rate " + i + " is = $" + (calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
