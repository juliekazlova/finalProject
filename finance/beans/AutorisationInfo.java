package by.epam.java.kazlova.finance.beans;

import java.util.Objects;

class AutorisationInfo {
    private String username;
    private String password;

    public AutorisationInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutorisationInfo)) return false;
        AutorisationInfo that = (AutorisationInfo) o;
        return Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword());
    }

    @Override
    public String toString() {
        return "AutorisationInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


