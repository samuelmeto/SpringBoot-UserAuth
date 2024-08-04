package com.samuelmeto.auth.authentication.email;

public interface EmailSender {
    public void send(String to, String email);
}
