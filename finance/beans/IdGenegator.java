package by.epam.java.kazlova.finance.beans;

public class IdGenegator {
    private static IdGenegator generator=new IdGenegator();
    private int id=0;

    private IdGenegator() {
    }

    public int getId() {
        id++;
        return id;
    }

    public static IdGenegator getInstance() {
        return generator;
    }

}
