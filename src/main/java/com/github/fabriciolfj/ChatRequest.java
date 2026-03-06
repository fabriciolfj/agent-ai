package com.github.fabriciolfj;


import java.util.Objects;

public class ChatRequest {

    private String user;
    private String message;

    public ChatRequest() { }

    public ChatRequest(final String user, final String message) {
        this.user = user;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public String getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChatRequest that = (ChatRequest) o;
        return Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(user);
    }

    @Override
    public String toString() {
        return "ChatRequest{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
