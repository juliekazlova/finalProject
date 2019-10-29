package by.epam.java.kazlova.finance.dao;

import by.epam.java.kazlova.finance.beans.Account;
import by.epam.java.kazlova.finance.beans.User;

public interface AccountDAO {
    boolean readAccount (User user)throws DAOException;

    boolean deleteAccount(Account account)throws DAOException;

    boolean updateAccount(Account account)throws DAOException;

    boolean createAccount(Account account)throws DAOException;

    Account findAccount(int accountId)throws DAOException;


}
