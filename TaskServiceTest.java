package taskServices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("123", "Task Name", "Task Description");
        taskService.addTask(task);
        assertNotNull(taskService.getTask("123"));
    }

    @Test
    public void testDeleteTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.deleteTask("123");
        assertNull(taskService.getTask("123"));
    }

    @Test
    public void testUpdateTaskName() {
        TaskService taskService = new TaskService();
        Task task = new Task("123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTaskName("123", "New Task Name");
        assertEquals("New Task Name", taskService.getTask("123").getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        TaskService taskService = new TaskService();
        Task task = new Task("123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTaskDescription("123", "New Task Description");
        assertEquals("New Task Description", taskService.getTask("123").getDescription());
    }
}
