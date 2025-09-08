/* 1.Create a Bank class and declare an instance variable named amount of type double.
Create parameterized constructor to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console. String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";

[Hint: Use constructor, ternary operator] Sample input: Amount=10000 Withdrawal amount=5000 Deposit amount=5000 */


package Demo;

import java.util.Scanner;

class Bank {
    // instance variable
    private double amount;

    // parameterized constructor
    public Bank(double amount) {
        this.amount = amount;
    }

    // withdraw method
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                         ? "Withdrawal successful" 
                         : "Insufficient balance";

        System.out.println(message);

        // update balance if sufficient
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // deposit method
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    // display balance
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialize with 10000
        Bank bank = new Bank(10000);

        // ask user for withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        bank.withdraw(withdrawalAmount);

        // ask user for deposit amount
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        bank.deposit(depositAmount);

        // display final balance
        bank.displayBalance();

        sc.close();
    }
}

//OUTPUT :-
/*Enter withdrawal amount: 10000
Withdrawal successful
Enter deposit amount: 5000
Deposited: 5000.0
Total Balance: 5000.0
*/