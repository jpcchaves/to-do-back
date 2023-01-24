package br.com.todoapp.todoapp.data.vo.v1.security;

import java.io.Serializable;

public class AccountCredentialsVO implements Serializable {

    private String username;
    private String password;

    public AccountCredentialsVO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
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
        if (o == null || getClass() != o.getClass()) return false;

        AccountCredentialsVO that = (AccountCredentialsVO) o;

        if (!username.equals(that.username)) return false;
        return password.equals(that.password);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
