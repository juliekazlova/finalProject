package by.epam.java.kazlova.finance.services;

import by.epam.java.kazlova.finance.beans.Account;
import by.epam.java.kazlova.finance.beans.User;
import by.epam.java.kazlova.finance.dao.AccountDAO;
import by.epam.java.kazlova.finance.dao.DAOException;
import by.epam.java.kazlova.finance.dao.DAOFactory;

public class BankService {
    void addNewAccount(Account account)throws ServiceException {
        DAOFactory factory = DAOFactory.getInstance();
        AccountDAO accountDAO = factory.getAccountDAO();
        try {
            if(!accountDAO.createAccount(account)) {
                throw new DAOException();
            }
        }
        catch (DAOException e){
            throw new ServiceException();
        }
    }


    void accountSetBlocked(int accountId) throws ServiceException{
        DAOFactory factory = DAOFactory.getInstance();
        AccountDAO accountDAO = factory.getAccountDAO();
        try {
            Account account=accountDAO.findAccount(accountId);
            Account updatedAccount=new Account(accountId, true, account.getBalance());
            if(!accountDAO.updateAccount(updatedAccount)) {
                throw new DAOException();
            }
        }
        catch (DAOException e){
            throw new ServiceException();
        }
    }

    void accountEditBalance(int accountId, int transaction) throws ServiceException{
        DAOFactory factory = DAOFactory.getInstance();
        AccountDAO accountDAO = factory.getAccountDAO();
        try {
            Account account=accountDAO.findAccount(accountId);
            Account updatedAccount=new Account(accountId, account.isBlocked(), account.getBalance()+transaction);
            if(!accountDAO.updateAccount(account)) {
                throw new DAOException();
            }
        }
        catch (DAOException e){
            throw new ServiceException();
        }
    }

    void deleteAccount(Account account)throws ServiceException{
        DAOFactory factory = DAOFactory.getInstance();
        AccountDAO accountDAO = factory.getAccountDAO();
        try {
            if(!accountDAO.deleteAccount(account)){
                throw new DAOException();
            }
        }
        catch (DAOException e){
            throw new ServiceException();
        }
    }

    void readAccounts(User user)throws ServiceException{
        DAOFactory factory = DAOFactory.getInstance();
        AccountDAO accountDAO = factory.getAccountDAO();
        try {
            if(!accountDAO.readAccount(user)){
                throw new DAOException();
            }
        }
        catch (DAOException e){
            throw new ServiceException();
        }
    }
}
