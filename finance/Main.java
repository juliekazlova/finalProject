package by.epam.java.kazlova.finance;

import by.epam.java.kazlova.finance.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        String response;

        String request = "sign_in aaa 1234";
        response = controller.executeTask(request);
        System.out.println(response);

        request = "Transaction 1 -200";
        response = controller.executeTask(request);
        System.out.println(response);

        request = "Transaction 2 199";
        response = controller.executeTask(request);
        System.out.println(response);

        request = "Add_Account 1000 true";
        response = controller.executeTask(request);
        System.out.println(response);

        request = "block_account 2";
        response = controller.executeTask(request);
        System.out.println(response);

    }
}

