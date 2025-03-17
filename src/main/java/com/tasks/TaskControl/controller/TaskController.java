package com.tasks.TaskControl.controller;

import com.tasks.TaskControl.controller.request.TaskRequest;
import com.tasks.TaskControl.entity.Task;
import com.tasks.TaskControl.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable String id) {
        return taskService.findById(id);
    }

    @PostMapping
    public Task createTask(@RequestBody TaskRequest taskRequest) {
        Task task = new Task();
        task.setTitulo(taskRequest.getTitulo());
        task.setImportante(taskRequest.getImportante());
        task.setDiaAtividade(taskRequest.getDiaAtividade());

        return taskService.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task task) {
        task.setUuid(id);
        return taskService.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteById(id);
    }
}
