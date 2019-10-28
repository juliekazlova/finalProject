package by.epam.java.kazlova.finance.services;

import by.epam.java.kazlova.finance.dao.DAOException;
import by.epam.java.kazlova.finance.dao.DAOFactory;
import by.epam.java.kazlova.finance.dao.UserDAO;

public class ClientService {
    public boolean authorization(String login, String password) throws ServiceException {

        DAOFactory factory = DAOFactory.getInstance();
        UserDAO userDAO = factory.getUserDAO();

        try {
            if (userDAO.signIn(login, password)) {
                return true;
            } else
                return false;
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

}