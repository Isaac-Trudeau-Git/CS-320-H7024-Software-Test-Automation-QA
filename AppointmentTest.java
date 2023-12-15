package appointmentService;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class AppointmentTest {

    @Test
    public void appointmentIDValidation() {
        IllegalArgumentException nullIDException = assertThrows(IllegalArgumentException.class,
                () -> new Appointment(null, new Date(), "Description"));
        assertEquals("Invalid appointment ID", nullIDException.getMessage());

        IllegalArgumentException longIDException = assertThrows(IllegalArgumentException.class,
                () -> new Appointment("12345678901", new Date(), "Description"));
        assertEquals("Invalid appointment ID", longIDException.getMessage());
    }
    @Test
    public void appointmentDateValidation() {
        Date pastDate = new Date(System.currentTimeMillis() - 1000000);
        IllegalArgumentException pastDateException = assertThrows(IllegalArgumentException.class,() -> new Appointment("ID12345678", pastDate, "Description"));
        assertEquals("Invalid appointment date", pastDateException.getMessage());

        IllegalArgumentException nullDateException = assertThrows(IllegalArgumentException.class,() -> new Appointment("ID12345678", null, "Description"));
        assertEquals("Invalid appointment date", nullDateException.getMessage());
    }

    @Test
    public void descriptionValidation() {
        IllegalArgumentException nullDescriptionException = assertThrows(IllegalArgumentException.class,() -> new Appointment("ID12345678", new Date(), null));
        assertEquals("Invalid description", nullDescriptionException.getMessage());

        IllegalArgumentException longDescriptionException = assertThrows(IllegalArgumentException.class,() -> new Appointment("ID12345678", new Date(), "This is a very long description that exceeds fifty characters limit"));
        assertEquals("Invalid description", longDescriptionException.getMessage());
    }
}
