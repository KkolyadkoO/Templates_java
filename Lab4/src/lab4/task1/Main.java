package lab4.task1;

import lab4.task1.account.Account;
import lab4.task1.account.CheckingAccount;
import lab4.task1.account.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        List<Account> accountCopyList = new ArrayList<>();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber(123);
        checkingAccount.setCreditLimit(321);
        checkingAccount.setBalance(120000.0);
        accountList.add(checkingAccount);

        CheckingAccount checkingAccount1 = new CheckingAccount();
        checkingAccount1.setAccountNumber(2);
        checkingAccount1.setCreditLimit(1000000);
        checkingAccount1.setBalance(10.0);
        accountCopyList.add(checkingAccount1);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber(1);
        savingsAccount.setInterestRate(7.2);
        savingsAccount.setBalance(100.5);
        accountList.add(savingsAccount);
        SavingsAccount clonedSavingAccount = (SavingsAccount) savingsAccount.clone();
        accountCopyList.add(clonedSavingAccount);


        accountList.add(checkingAccount1);
        accountCopyList.add(checkingAccount1);

        cloneAndCompare(accountList, accountCopyList);

    }
    private static void cloneAndCompare(List<Account> originals, List<Account> copies) {
        for (Account account : originals) {
            copies.add(account.clone());
        }

        for (int i = 0; i < originals.size(); i++) {
            Account original = originals.get(i);
            Account copy = copies.get(i);

            if (original != copy) {
                System.out.println(i + ": Объекты разные. ");
                if (original.equals(copy)) {
                    System.out.println(i + " Поля объектов с индексом "+i+" идентичны");
                } else {


                    System.out.println(i + " Поля объектов с индексом "+i+" не идентичны");

                }
            } else {
                System.out.println(i + " Объекты одинаковы");
            }
        }
    }
}
