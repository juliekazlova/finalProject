package by.epam.java.kazlova.finance.services;

import by.epam.java.kazlova.finance.beans.Account;

public class  AddAccountCommand implements Command{
    @Override
    public boolean execute(String request) throws ServiceException {
        String[] data=request.split(" ");
        ServiceFactory factory=ServiceFactory.getInstance();
        BankService bankService=factory.getBankService();
        try {
            bankService.addNewAccount(new Account(Integer.parseInt(data[1]), Boolean.getBoolean(data[2])));
        } catch (ServiceException e){
            throw new ServiceException();
        }
        return true;

    }
}
