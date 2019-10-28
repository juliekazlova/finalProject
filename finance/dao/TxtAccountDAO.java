package by.epam.java.kazlova.finance.dao;

import by.epam.java.kazlova.finance.beans.Account;
import by.epam.java.kazlova.finance.beans.User;

import java.io.*;
import java.util.Scanner;

public class TxtAccountDAO implements AccountDAO {
    private static final String ACCOUNT_SOURCE = "src\\by\\epam\\intro\\finmanager\\resource\\accountInfo.txt";

    @Override
    public boolean readAccount(User user) throws DAOException {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(ACCOUNT_SOURCE));
            while (scanner.hasNext()) {
                user.addAccount(new Account(scanner.nextInt(), scanner.nextBoolean(), scanner.nextInt()));
            }

            if (scanner != null) {
                scanner.close();
            }

        } catch (FileNotFoundException e){
            throw new DAOException();
        }
finally {
          return true;
        }
    }

    @Override
    public boolean deleteAccount(Account account) throws DAOException {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(ACCOUNT_SOURCE));
            String accountInfo = account.getString();
            String currentLine;
            StringBuilder sb=new StringBuilder();
            while (scanner.hasNext()) {
                currentLine=scanner.nextLine();
                if (currentLine.equals(accountInfo)) {
                    break;
                }
                sb.append(currentLine);
            }
            if (scanner.hasNextLine()) {
                return false;
            }
            while (scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
            PrintWriter printWriter=new PrintWriter(new File(ACCOUNT_SOURCE));
            printWriter.print(sb.toString());
        } catch (FileNotFoundException e){
            throw new DAOException();
        }

        finally {

            if (scanner != null) {
                scanner.close();
            }
            return true;
        }

    }

    public boolean updateAccount(Account account)throws DAOException{
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(ACCOUNT_SOURCE));
            String accountInfo = account.getString();
            int accountId=account.getAccountID();
            StringBuilder sb=new StringBuilder();
            while (scanner.hasNext()) {
                int currentID=scanner.nextInt();
                if (currentID==accountId) {
                   break;
                }
                sb.append(currentID).append(" ").append(scanner.nextBoolean()).append(" ").append(scanner.nextInt());
            }
            if (!scanner.hasNext()) {
                return false;
            }
            sb.append(account.getString());
            while (scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
            PrintWriter printWriter=new PrintWriter(new File(ACCOUNT_SOURCE));
            printWriter.print(sb.toString());
        } catch (FileNotFoundException e){
            throw new DAOException();
        }

        finally {

            if (scanner != null) {
                scanner.close();
            }
            return true;
        }
    }

    public boolean createAccount(Account account)throws DAOException{
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(ACCOUNT_SOURCE));
            String accountInfo = account.getString();
            StringBuilder sb=new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            sb.append(accountInfo);
            PrintWriter printWriter=new PrintWriter(new File(ACCOUNT_SOURCE));
            printWriter.print(sb.toString());
        } catch (FileNotFoundException e){
            throw new DAOException();
        }

        finally {

            if (scanner != null) {
                scanner.close();
            }
            return true;
        }
    }


}
