package com.example.taskmaster.controller;

import com.example.taskmaster.model.Task;
import com.example.taskmaster.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // 1. Create a Task (POST request)
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // 2. Get all Tasks (GET request)
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}