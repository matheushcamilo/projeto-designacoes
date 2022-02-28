package br.com.congregacao.designacoes.service;

import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public String saveTask(Task task) {
        Task savedTask = taskRepository.save(task);
        return "Designação de ID " + savedTask.getId() + " foi criada com sucesso";
    }
}
