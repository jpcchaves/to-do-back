package br.com.todoapp.todoapp.data.vo.v1.security;

import java.io.Serializable;

public class AccountCredentialsVO implements Serializable {

    private String userName;
    private String password;

    public AccountCredentialsVO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

        if (!userName.equals(that.userName)) return false;
        return password.equals(that.password);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
