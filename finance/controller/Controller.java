package by.epam.java.kazlova.finance.controller;

import by.epam.java.kazlova.finance.services.*;

public class Controller {
    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String command;
        command = request.substring(0, request.indexOf(paramDelimeter));
        String[] data=command.split(" ");
        String response = null;
        switch(data[0]){
            case "SIGN_IN":
// do action (call services and others) and create a response
                SignInCommand signInCommand=new SignInCommand();
                try {
                    signInCommand.execute(command);
                } catch (ServiceException e){
                    response="SignIn error!";
                }
                break;
            case "ADD_ACCOUNT":
// do action and create a response
                AddAccountCommand addAccountCommand=new AddAccountCommand();
                try {
                    addAccountCommand.execute(command);
                } catch (ServiceException e){
                    response="Add account error!";
                }
                break;
            case "BLOCK_ACCOUNT":
                BlockAccountCommand blockAccountCommand=new BlockAccountCommand();
                try {
                    blockAccountCommand.execute(command);
                } catch (ServiceException e){
                    response="Account blocking error!";
                }
                break;
            case "TRANSACTION":
                AccountTransactionCommand accountTransactionCommand=new AccountTransactionCommand();
                try {
                    accountTransactionCommand.execute(command);
                } catch (ServiceException e){
                    response="Transaction error!";
                }
                break;
            default:
                response = "We can't execute this command";
        }
        return response;
    }
}
