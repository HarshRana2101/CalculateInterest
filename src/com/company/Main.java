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
            System.out.println("loop" + i + "= hello");
        }
*/
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount + amount * (interestRate / 100));
    }
}
