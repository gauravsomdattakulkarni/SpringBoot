package com.gauravkulkarni.todoapplication.bean;

public class HelloUserBean {
    private Boolean status;
    private String message;

    public HelloUserBean(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HelloUserBean{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
