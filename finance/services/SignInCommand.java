package by.epam.java.kazlova.finance.services;

public class SignInCommand implements Command{
    @Override
    public boolean execute(String request) throws ServiceException {
        String[] data=request.split(" ");
        ServiceFactory factory=ServiceFactory.getInstance();
        ClientService clientService=factory.getCLientService();
        if(!clientService.authorization(data[1], data[2])){
            return false;
        }
        return true;

    }
}
