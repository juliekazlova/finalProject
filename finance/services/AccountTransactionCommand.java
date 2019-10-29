package by.epam.java.kazlova.finance.services;


public class AccountTransactionCommand implements Command {
    @Override
    public boolean execute(String request) throws ServiceException {
        String[] data=request.split(" ");
        ServiceFactory factory=ServiceFactory.getInstance();
        BankService bankService=factory.getBankService();
        try {
            bankService.accountEditBalance(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        } catch (ServiceException e){
            throw new ServiceException();
        }
        return true;

    }
}
