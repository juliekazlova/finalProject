package by.epam.java.kazlova.finance.controller;

public class Controller {
    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String command;
        command = request.substring(0, request.indexOf(paramDelimeter));
        command = command.toUpperCase();
        String response = null;
        switch(command){
            case "SIGN_IN":
// do action (call services and others) and create a response
                break;
            case "ADD_ACCOUNT":
// do action and create a response
                break;
            default:
                response = "We can't execute this command";
        }
        return response;
    }
}
