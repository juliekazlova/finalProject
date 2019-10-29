package by.epam.java.kazlova.finance.services;


public class BlockAccountCommand implements Command{
    @Override
    public boolean execute(String request) throws ServiceException {
        String[] data=request.split(" ");
        ServiceFactory factory=ServiceFactory.getInstance();
        BankService bankService=factory.getBankService();
        try {
            bankService.accountSetBlocked(Integer.parseInt(data[1]));
        } catch (ServiceException e){
            throw new ServiceException();
        }
        return true;

    }
}
