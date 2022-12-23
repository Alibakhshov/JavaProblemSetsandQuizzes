//Instructions:
//        A class called Account, which models a bank account, is designed as shown in the class diagram. It contains:
//
//        Two private data members: accountNumber (int) and balance (double), which maintains the current account balance.
//        Public functions credit() and debit(), which adds or subtracts the given amount from the balance, respectively. The debit() function shall print "amount withdrawn exceeds the current balance!" if amount is more than balance.
//        A public function print(), which shall print "A/C no: xxx Balance=xxx" (e.g., A/C no: 991234 Balance=$88.88), with balance rounded to two decimal places.
//        An overrided public function toString(), which returns String "A/C no: xxx Balance=xxx" (e.g., A/C no: 991234 Balance=$88.88), with balance rounded to two decimal places.
//        Bacnk Account UML Class diagram
//        Submit the Java code for Account.java  that implements the above design.

package Week6;

import java.util.Formatter;

public class Account {
    private final int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void credit(double amount) {
        this.balance += amount;
    }
    public void debit(double amount) {
        if(amount > this.balance) {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        else {
            this.balance -= amount;
        }
    }

    public void print() {
        System.out.printf("A/C no: %d Balance=$%.2f%n", this.accountNumber, this.balance);
    }
    public String toString() {
        Formatter balanceToPrint = new Formatter();
        balanceToPrint.format("%.2f", this.balance);
        return "A/C no: " + this.accountNumber +
                " Balance=" + balanceToPrint;
    }
}