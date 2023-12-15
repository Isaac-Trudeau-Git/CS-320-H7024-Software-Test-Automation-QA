package appointmentService;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments;

    public AppointmentService() {
        appointments = new HashMap<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.put(appointment.getAppointmentID(), appointment);
    }

    public void deleteAppointment(String appointmentID) {
        appointments.remove(appointmentID);
    }

    public Appointment getAppointmentByID(String appointmentID) {
        return appointments.get(appointmentID);
    }
    
    public int getAppointmentsCount() {
        return appointments.size();
    }
}
