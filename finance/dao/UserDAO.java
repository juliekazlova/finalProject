package by.epam.java.kazlova.finance.dao;


import by.epam.java.kazlova.finance.beans.User;

public interface UserDAO {
    void signIn(String login, String password);

    void registration(User user);
}