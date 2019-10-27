package by.epam.java.kazlova.finance.dao;

import by.epam.java.kazlova.finance.beans.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtUserDao implements UserDAO {

    private static final String USER_SOURCE = "src\\by\\epam\\intro\\finmanager\\resource\\authInfo.txt";

    @Override
    public boolean signIn (String login, String password) throws DAOException {

            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader(USER_SOURCE));
                String info = reader.readLine();
                if (info.equals(login.concat(" ").concat(password))) {
                    return true;
                }
                return false;

            } catch (FileNotFoundException e) {
                throw new DAOException(e);

            } catch (IOException e) {
                throw new DAOException(e);
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {

                    throw new DAOException(e);
                }
            }

            // описать то, что мы ищем и делаем

        }

    }

