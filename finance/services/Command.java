package by.epam.java.kazlova.finance.services;

public interface Command {
    boolean execute(String request) throws ServiceException;


}
