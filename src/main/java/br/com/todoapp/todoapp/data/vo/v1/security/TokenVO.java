package br.com.todoapp.todoapp.data.vo.v1.security;

import java.io.Serializable;
import java.util.Date;

public class TokenVO implements Serializable {

    private String userName;
    private Boolean authenticated;
    private Date created;
    private Date expiration;
    private String accessToken;
    private String refreshToken;

    public TokenVO() {
    }

    public TokenVO(String userName, Boolean authenticated, Date created, Date expiration, String accessToken, String refreshToken) {
        this.userName = userName;
        this.authenticated = authenticated;
        this.created = created;
        this.expiration = expiration;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getUserName() {
        return userName;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TokenVO tokenVO = (TokenVO) o;

        if (!userName.equals(tokenVO.userName)) return false;
        if (!authenticated.equals(tokenVO.authenticated)) return false;
        if (!created.equals(tokenVO.created)) return false;
        if (!expiration.equals(tokenVO.expiration)) return false;
        if (!accessToken.equals(tokenVO.accessToken)) return false;
        return refreshToken.equals(tokenVO.refreshToken);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + authenticated.hashCode();
        result = 31 * result + created.hashCode();
        result = 31 * result + expiration.hashCode();
        result = 31 * result + accessToken.hashCode();
        result = 31 * result + refreshToken.hashCode();
        return result;
    }
}
