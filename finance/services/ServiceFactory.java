package by.epam.java.kazlova.finance.services;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ClientService clientService = new ClientService();
    private final BankService bankService = new BankService();



    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }

    public ClientService getCLientService(){
        return clientService;
    }

    public BankService getBankService(){
        return bankService;
    }
}
