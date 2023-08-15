package com.churchapplication.testapplication;

//사용자 계정 모델 클래스임
public class UserAccount {

    private String emailId;//
    private String password;
    private String IdToken; // Firebase Uid (고유 토큰정보)

    public void setIdToken(String idToken) {
        IdToken = idToken;
    }

    public String getIdToken() {
        return IdToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public UserAccount(){ }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password; }
}
