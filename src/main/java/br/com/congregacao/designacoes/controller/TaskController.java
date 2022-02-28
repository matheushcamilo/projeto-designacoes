package br.com.congregacao.designacoes.controller;


import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping()
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping()
    public String createTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }
}
