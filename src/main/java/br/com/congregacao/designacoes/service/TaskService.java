package br.com.congregacao.designacoes.service;

import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.enums.TipoDesignacao;
import br.com.congregacao.designacoes.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {return taskRepository.findById(id);}

    public String saveTask(List<Task> tasks) {
        try {
            for(Task task: tasks) taskRepository.save(task);
            return tasks.size() + " tasks have been created!";
        } catch (Exception e) {
            return "An error occurred";
        }
    }
}
