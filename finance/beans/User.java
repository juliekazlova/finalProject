package by.epam.java.kazlova.finance.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private AutorisationInfo autorisationInfo;
    private String email;
    private String name;
    private List<Account> accounts;


    public User(String username, String password) {

        autorisationInfo=new AutorisationInfo(username, password);
        this.accounts = new ArrayList<>();
    }

    public User(AutorisationInfo autorisationInfo, String email, String name) {
        this.autorisationInfo = autorisationInfo;
        this.email = email;
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public AutorisationInfo getAutorisationInfo() {
        return autorisationInfo;
    }

    public void setAutorisationInfo(AutorisationInfo autorisationInfo) {
        this.autorisationInfo = autorisationInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getAutorisationInfo(), user.getAutorisationInfo()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getAccounts(), user.getAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutorisationInfo(), getEmail(), getName(), getAccounts());
    }

    @Override
    public String toString() {
        return "User{" +
                "autorisationInfo=" + autorisationInfo.toString() +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
