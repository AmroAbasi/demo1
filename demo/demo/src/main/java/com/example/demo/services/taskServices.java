package com.example.demo.services;

import com.example.demo.entities.task;
import com.example.demo.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class taskServices {

    @Autowired
    private taskRepository repository;

    public ArrayList<task> getAllTasks() {
        return (ArrayList<task>) repository.findAll();
    }

    public task addTask(task t) {
        return repository.save(t);
    }

    public ArrayList<task> getAllT() {
        return (ArrayList<task>) repository.findAll();
    }

    public Optional<task> findTaskById(Long id) {
        return repository.findById(id);
    }
}
