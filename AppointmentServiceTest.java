package appointmentService;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AppointmentServiceTest {

    @Test
    public void addAndDeleteAppointmentTest() {
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("ID12345678", new Date(), "Description");
        appointmentService.addAppointment(appointment);
        assertEquals(1, appointmentService.getAppointmentsCount());
        appointmentService.deleteAppointment(appointment.getAppointmentID());
        assertEquals(0, appointmentService.getAppointmentsCount());
    }
    @Test
    public void getAppointmentByIDTest() {
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("ID12345678", new Date(), "Description");
        appointmentService.addAppointment(appointment);
        assertEquals(appointment, appointmentService.getAppointmentByID(appointment.getAppointmentID()));
    }
}
