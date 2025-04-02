package lab4.task1.account;

public class CheckingAccount extends Account{
    private double creditLimit;

    public CheckingAccount(){}

    public CheckingAccount(CheckingAccount target){
        super(target);
        if(target != null){
            this.creditLimit = target.getCreditLimit();
        }
    }

    @Override
    public Account clone() {
        return new CheckingAccount(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CheckingAccount) || !super.equals(obj)) return false;
        CheckingAccount checkingAccount = (CheckingAccount) obj;
        return Double.compare(checkingAccount.creditLimit, creditLimit) == 0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }


}
