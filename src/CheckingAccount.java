/***
 *       <<< THIS CODE IS NOT COMPLETE >>>
 *  CheckingAccount is a Subclass of BankAccount:
 *
 *  All methods are inherited.
 *
 *  Private instance fields must be accessed using getters
 *  and setters.
 *
 *  Note: methods can be overridden, but instance fields can NOT.
 */
public class CheckingAccount extends BankAccount {

    /**
     * The bank charges a fee 'TRANSACTION_FEE' for
     * each transaction on checking accounts.
     */

    private static final double TRANSACTION_FEE = 0.50;

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * Constructs a checking account with a given balance.
     */

    public CheckingAccount(double initialBalance) {
        super(initialBalance);


        // <<< Code Not Complete >>>

    }

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * override the deposit method in superclass (use super)
     * don't forget to charge a transaction fee
     */
    public void deposit(double amount) {
        super.deposit(amount - TRANSACTION_FEE);

        // <<< Code Not Complete >>>

    }

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * overrides withdraw in superclass
     * don't forget to charge a transaction fee
     */
    public void withdraw(double amount) {

        if (amount + TRANSACTION_FEE < getBalance()) {
            super.withdraw(amount + TRANSACTION_FEE);
            // <<< Code Not Complete >>>
        } else {
            super.withdraw(0);
        }
    }


    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * Transfers money from the account to another account
     */
    public void transfer(double amount, BankAccount other) {
        // <<< Code Not Complete >>>
        if (super.getBalance() >= amount + TRANSACTION_FEE) {
           withdraw(amount);
           other.deposit(amount);

        }
    }
}
