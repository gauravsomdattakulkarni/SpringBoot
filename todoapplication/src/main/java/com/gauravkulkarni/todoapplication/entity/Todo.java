package com.gauravkulkarni.todoapplication.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {
    private long todoId;
    private String username;
    private String description;
    private LocalDate addedDate;
    private LocalDate targetDate;
    private boolean isDone;

    public Todo() {
    }

    public Todo(long todoId, String username, String description, LocalDate addedDate, LocalDate targetDate, boolean isDone) {
        this.todoId = todoId;
        this.username = username;
        this.description = description;
        this.addedDate = addedDate;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public long getTodoId() {
        return todoId;
    }

    public void setTodoId(long todoId) {
        this.todoId = todoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", addedDate=" + addedDate +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return todoId == todo.todoId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(todoId);
    }
}
