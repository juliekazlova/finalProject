package by.epam.java.kazlova.finance.beans;

import java.util.Objects;

public class Account {
    private int balance;
    private boolean isBlocked;
    private int accountID;

    public Account(int balance, boolean isBlocked) {
        this.balance = balance;
        this.isBlocked = isBlocked;
        accountID=IdGenegator.getInstance().getId();

    }

    public Account(int balance, boolean isBlocked, int accountID) {
        this.balance = balance;
        this.isBlocked = isBlocked;
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getBalance() == account.getBalance() &&
                isBlocked() == account.isBlocked() &&
                getAccountID() == account.getAccountID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBalance(), isBlocked(), getAccountID());
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", isBlocked=" + isBlocked +
                ", accountID=" + accountID +
                '}';


    }

    public String getString(){
        StringBuilder sb=new StringBuilder(accountID);
        sb.append(" ").append(isBlocked).append(" ").append(balance);
        return sb.toString();
    }
}
