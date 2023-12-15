package taskServices;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<String, Task> tasks;

    public TaskService() {
        this.tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        if (tasks.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists");
        }
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }

    public void updateTaskName(String taskId, String newName) {
        Task taskToUpdate = tasks.get(taskId);
        if (taskToUpdate != null) {
            taskToUpdate.setName(newName);
        } else {
            throw new IllegalArgumentException("Task not found");
        }
    }

    public void updateTaskDescription(String taskId, String newDescription) {
        Task taskToUpdate = tasks.get(taskId);
        if (taskToUpdate != null) {
            taskToUpdate.setDescription(newDescription);
        } else {
            throw new IllegalArgumentException("Task not found");
        }
    }

    // Method to get a task by ID
    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}
