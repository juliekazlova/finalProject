package by.epam.java.kazlova.finance.dao;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();//singleton

    private final AccountDAO txtAccountDAO =new TxtAccountDAO();
    private final UserDAO txtUserDAO=new TxtUserDao();

    private DAOFactory(){}
    public static DAOFactory getInstance(){
        return instance;
    }
    public AccountDAO getAccountDAO(){
        return txtAccountDAO;
    }
    public UserDAO getUserDAO() {
        return txtUserDAO;
    }
}
