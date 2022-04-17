package br.com.congregacao.designacoes.controller;


import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.enums.TipoDesignacao;
import br.com.congregacao.designacoes.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
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
    public String createTask(@RequestBody List<Task> tasks){
        return taskService.saveTask(tasks);
    }
    @GetMapping(path = "/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id){return taskService.getTaskById(id);}
}
