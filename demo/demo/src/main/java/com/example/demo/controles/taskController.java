package com.example.demo.controles;
import com.example.demo.entities.task;
import com.example.demo.services.taskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class taskController {

    @Autowired
    private taskServices taskServices;

    @PostMapping("/tasks/addTask")
    public @ResponseBody task addTask(@RequestBody task t)
    {
        return taskServices.addTask(t);
    }

    @GetMapping("/tasks/getAll")
    public @ResponseBody ArrayList<task> getAllTasks()
    {
        return  taskServices.getAllTasks();
    }

    @GetMapping("/tasks/findTask/{id}")
    public @ResponseBody Optional<task> findTaskById(@PathVariable Long id)
    {
        return taskServices.findTaskById(id);
    }
}
