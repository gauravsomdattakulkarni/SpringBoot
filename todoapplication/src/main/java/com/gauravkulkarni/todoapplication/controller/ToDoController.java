package com.gauravkulkarni.todoapplication.controller;

import com.gauravkulkarni.todoapplication.entity.Todo;
import com.gauravkulkarni.todoapplication.service.ToDoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ToDoController {
    @Autowired
    private ToDoServiceV1 toDoServiceV1;

    @RequestMapping(method = RequestMethod.GET , path = "/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return toDoServiceV1.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE,path="/users/{username}/todos/{todoId}")
    public ResponseEntity<Void> deleteTodoDetails(@PathVariable String username , @PathVariable String todoId){
        Todo tododetails = toDoServiceV1.deleteTodoById(Long.parseLong(todoId));
        System.out.println("TODO DEAILS : " + tododetails);
        if(tododetails!=null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.GET , path = "/users/{username}/todos/{todoId}")
    public Todo getTodoDetails(@PathVariable String username , @PathVariable Long todoId){
        return toDoServiceV1.findTodoById(todoId);
    }
    
    
}
