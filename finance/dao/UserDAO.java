package by.epam.java.kazlova.finance.dao;


import by.epam.java.kazlova.finance.beans.User;

public interface UserDAO {
    boolean signIn(String login, String password) throws DAOException;
}