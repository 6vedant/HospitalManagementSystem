import appointment.Appointment;
import person.Doctor;
import person.Patient;
import room.Room;

public class HospitalManager {

    // Hospital Manager class will contain the instances of the Doctor, Patient, Room and Appointment class
    // for better appointment management

    public static void main(String[] args) {

        //creating patient instance
        Patient patient = new Patient(123);
        //creating doctor instance
        Doctor doctor = new Doctor(900);

        // creating room instance
        Room room = new Room(100);

        //create the appointment using the above created instance
        Appointment appointment = new Appointment(343, patient, doctor, room);

        System.out.println(appointment.getPatient().getPatientId());

    }


}

