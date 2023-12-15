package taskServices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTaskCreationValid() {
        Task task = new Task("1234567890", "Task Name", "Task Description");
        assertEquals("1234567890", task.getTaskId());
        assertEquals("Task Name", task.getName());
        assertEquals("Task Description", task.getDescription());
    }

    @Test
    public void testTaskIDTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Task Name", "Task Description");
        });
    }

    @Test
    public void testTaskIDNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Task Name", "Task Description");
        });
    }

    @Test
    public void testTaskNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name That Is Too Long", "Task Description");
        });
    }

    @Test
    public void testTaskNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", null, "Task Description");
        });
    }

    @Test
    public void testTaskDescriptionTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name", "Task Description That Is Way Too Long and Exceeds Fifty Characters Limit");
        });
    }

    @Test
    public void testTaskDescriptionNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name", null);
        });
    }
}
