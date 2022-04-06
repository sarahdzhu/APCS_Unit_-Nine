/**
 *       <<< THIS CODE IS NOT COMPLETE >>>
 *   An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 10;

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given interest rate.
     */
    public SavingsAccount(double rate)  {
        interestRate = rate;
    }

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given balance
     *   and a given interest rate.
     */
    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        interestRate = rate;
        if (initialBalance <= MINIMUM_BALANCE) {
            deposit(MINIMUM_BALANCE-initialBalance);
        }
    }


    /**  <<< COMPLETE THIS METHOD >>>
     *   Adds the earned interest to the account balance.
     */
    public void addInterest()   {
        super.deposit(getBalance() * interestRate);
        // <<< CODE NOT COMPLETE >>>
    }

    /** <<< COMPLETE THIS METHOD>>>
     *  overrides withdraw in the superclass
     *  only allows withdrawal to occur if
     *  resulting balance > MINIMUM_BALANCE
     */
    public void withdraw(double amount)  {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        }
        // <<< Code Not Complete >>>
    }
}

