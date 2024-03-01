package com.vDevs.Task.Management.service;

import com.vDevs.Task.Management.model.Task;
import com.vDevs.Task.Management.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Task saveTask(Task t){
        return taskRepository.save(t);
    }

    public Optional<Task> findTaskById(Long id){
        return taskRepository.findById(id);
    }

    public List<Task> findAllTasks(){
        return taskRepository.findAll();
    }

    public void deleteTask(Long id){
        if (!taskRepository.existsById(id)) {
            // Throw an exception if the task doesn't exist
            throw new RuntimeException("Task not found with id " + id);
        }
        taskRepository.deleteById(id);
    }

    public void updateTask(Long id, Task taskDetails){
        Task task = taskRepository.findById(id).orElseThrow(()-> new RuntimeException("Task not found with id " + id));
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setDueDate(taskDetails.getDueDate());
        task.setCompleted(taskDetails.isCompleted());
        taskRepository.save(task);
    }
}
