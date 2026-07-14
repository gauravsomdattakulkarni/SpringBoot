package com.gauravkulkarni.todoapplication.service;

import com.gauravkulkarni.todoapplication.entity.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceV1 {
    private static List<Todo> todos = new ArrayList();

    static {
        todos.add(new Todo(1, "admin", "Analyze Real Madrid vs Barcelona tactical setup", LocalDate.now(), LocalDate.now().plusDays(1), false));
        todos.add(new Todo(2, "admin", "Complete Spring Boot authentication module", LocalDate.now(), LocalDate.now().plusDays(3), false));
        todos.add(new Todo(3, "admin", "Prepare for cloud architecture certification", LocalDate.now(), LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(4, "admin", "Review database schema optimization techniques", LocalDate.now(), LocalDate.now().plusDays(2), true));
        todos.add(new Todo(5, "admin", "Watch Premier League highlights", LocalDate.now(), LocalDate.now(), false));
        todos.add(new Todo(6, "admin", "Learn Kubernetes deployment strategies", LocalDate.now(), LocalDate.now().plusDays(5), false));
        todos.add(new Todo(7, "admin", "Update professional resume and LinkedIn profile", LocalDate.now(), LocalDate.now().plusDays(7), false));
        todos.add(new Todo(8, "admin", "Study historical football manager tactics", LocalDate.now(), LocalDate.now().plusDays(4), false));
        todos.add(new Todo(9, "admin", "Refactor existing monolith to microservices", LocalDate.now(), LocalDate.now().plusWeeks(2), false));
        todos.add(new Todo(10, "admin", "Network with industry peers on new IT trends", LocalDate.now(), LocalDate.now().plusDays(10), false));
        todos.add(new Todo(11, "admin", "Analyze Champions League group standing", LocalDate.now(), LocalDate.now().plusDays(2), false));
        todos.add(new Todo(12, "admin", "Master Spring Security filters", LocalDate.now(), LocalDate.now().plusDays(6), false));
        todos.add(new Todo(13, "admin", "Research remote work career growth paths", LocalDate.now(), LocalDate.now().plusDays(8), false));
        todos.add(new Todo(14, "admin", "Practice Goalkeeping drills at the pitch", LocalDate.now(), LocalDate.now().plusDays(3), false));
        todos.add(new Todo(15, "admin", "Debug production environment performance issues", LocalDate.now(), LocalDate.now().plusDays(1), true));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo findTodoById(long todoId) {
        for(Todo todo:todos){
            if (todo.getTodoId() == todoId) {
                System.out.println("TODO DETAILS  : " + todo);
                return todo;
            }
        }
        System.out.println("404 TOTO");
        return null;
    }

    public Todo deleteTodoById(long todoId){
        System.out.println("Long TODO Id : " + todoId);
        Todo todoDetails = findTodoById(todoId);
        if (todoDetails == null){
            System.out.println("404 TODO Delete Method");
            return null;
        }
        if(todos.remove(todoDetails)){
            return todoDetails;
        }else{
            return null;
        }
    }

    public Todo saveTodoDetails(Todo todoData){
        if(todoData.getTodoId()==-1){
            todoData.setTodoId(todos.get(todos.size() - 1).getTodoId() + 1);
            todos.add(todoData);
        }else{
            deleteTodoById(todoData.getTodoId());
            todos.add(todoData);
        }
        return todoData;
    }
}
