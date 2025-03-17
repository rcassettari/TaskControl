package com.tasks.TaskControl.service;

import com.tasks.TaskControl.entity.Task;
import com.tasks.TaskControl.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(String id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void deleteById(String id) {
        taskRepository.deleteById(id);
    }
}

