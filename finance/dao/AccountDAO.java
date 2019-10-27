package by.epam.java.kazlova.finance.dao;

import by.epam.java.kazlova.finance.beans.Account;

public interface AccountDAO {
    void addAccount (Account account);

    void deleteAccount(Account account);

}
