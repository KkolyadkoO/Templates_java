package lab4.task1.account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
    }



    public SavingsAccount(SavingsAccount target){
        super(target);
            if (target != null){
                this.interestRate = target.getInterestRate();
            }
    }

    @Override
    public Account clone() {
        return new SavingsAccount(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SavingsAccount) || !super.equals(obj)) return false;
        SavingsAccount savingsAccount = (SavingsAccount) obj;
        return Double.compare(savingsAccount.interestRate, interestRate) == 0;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
