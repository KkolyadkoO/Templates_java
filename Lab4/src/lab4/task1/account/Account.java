package lab4.task1.account;


public abstract class Account {
    protected double balance;
    protected double accountNumber;

    public Account() {

    }

    public Account(Account target) {
        if(target != null) {
            this.balance = target.getBalance();
            this.accountNumber = target.getAccountNumber();
        }
    }

    public abstract Account clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) return false;
        Account account = (Account) obj;
        return Double.compare(account.balance, balance) == 0
               && Double.compare(account.accountNumber, accountNumber) == 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }
}
