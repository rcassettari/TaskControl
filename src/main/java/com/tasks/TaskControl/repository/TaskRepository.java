package com.tasks.TaskControl.repository;

import com.tasks.TaskControl.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
}