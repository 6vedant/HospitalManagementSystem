package appointment;

import person.Doctor;
import person.Patient;
import room.Room;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Appointment {

    int appointmentId;

    // patient and doctor instance
    Patient patient;
    Doctor doctor;


    // room instance for appointment
    Room room;

    LocalDate date; //date for the appointment
    LocalTime startTime; // start time for the appointment
    LocalTime endTime; // end time for the appointment

    String note; // any specific note, for this appointment

    //parameterized constructor
    public Appointment(int appointmentId, Patient patient, Doctor doctor, Room room) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.room = room;
    }


    //required getter and setters
    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getNote() {
        return note;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDate(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setNote(String note) {
        this.note = note;
    }

    //static methods for appointment management
    // methods for roomAvailable, comingAppointments and previousAppointments

    public static boolean isRoomAvailable(List<Appointment> appointments,
                                          Room room, LocalDate date,
                                          LocalTime startTime,
                                          LocalTime endTime) {
        //checking each appointment for which the room is occupied or not, from startTime to endTime.
        for (Appointment appointment : appointments) {
            if (appointment.getDate().isEqual(date)) {
                if (appointment.getStartTime().isAfter(startTime) && appointment.getEndTime().isBefore(endTime)) {
                    return false;
                }
            }
        }
        // all appointments were not in between the given time range, so room is available
        return true;
    }

    //checking upcoming appointments in future with no constraint
    public static List<Appointment> getUpcomingAppointments(List<Appointment> appointments) {
        List<Appointment> upcomingAppointments = new ArrayList<>();

        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getDate().isAfter(todayDate)) {
                upcomingAppointments.add(appointment);
            } else {
                if (appointment.getDate().isEqual(todayDate) && appointment.getStartTime().isAfter(currentTime)) {
                    upcomingAppointments.add(appointment);
                }
            }
        }
        return upcomingAppointments;
    }

    // checking upcoming appointments for a patient
    public static List<Appointment> getUpcomingAppointments(List<Appointment> appointments, Patient patient) {
        List<Appointment> upcomingAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getPatient().equals(patient)) {
                if (appointment.getDate().isAfter(todayDate)) {
                    upcomingAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getStartTime().isAfter(currentTime)) {
                        upcomingAppointments.add(appointment);
                    }
                }
            }
        }
        return upcomingAppointments;
    }


    // checking upcoming appointments for a doctor
    public static List<Appointment> getUpcomingAppointments(List<Appointment> appointments, Doctor doctor) {
        List<Appointment> upcomingAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().equals(doctor)) {
                if (appointment.getDate().isAfter(todayDate)) {
                    upcomingAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getStartTime().isAfter(currentTime)) {
                        upcomingAppointments.add(appointment);
                    }
                }
            }
        }
        return upcomingAppointments;
    }

    // checking upcoming appointments for the particular room
    public static List<Appointment> getUpcomingAppointments(List<Appointment> appointments, Room room) {
        List<Appointment> upcomingAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getRoom().equals(room)) {
                if (appointment.getDate().isAfter(todayDate)) {
                    upcomingAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getStartTime().isAfter(currentTime)) {
                        upcomingAppointments.add(appointment);
                    }
                }
            }
        }
        return upcomingAppointments;
    }


    //checking previous appointments in past with no constraint
    public static List<Appointment> getPreviousAppointments(List<Appointment> appointments) {
        List<Appointment> previousAppointments = new ArrayList<>();

        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getDate().isBefore(todayDate)) {
                previousAppointments.add(appointment);
            } else {
                if (appointment.getDate().isEqual(todayDate) && appointment.getEndTime().isBefore(currentTime)) {
                    previousAppointments.add(appointment);
                }
            }
        }
        return previousAppointments;
    }


    // checking previous appointments for a patient
    public static List<Appointment> getPreviousAppointments(List<Appointment> appointments, Patient patient) {
        List<Appointment> previousAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getPatient().equals(patient)) {
                if (appointment.getDate().isBefore(todayDate)) {
                    previousAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getEndTime().isBefore(currentTime)) {
                        previousAppointments.add(appointment);
                    }
                }
            }
        }
        return previousAppointments;
    }

    // checking previous appointments for a doctor
    public static List<Appointment> getPreviousAppointments(List<Appointment> appointments, Doctor doctor) {
        List<Appointment> previousAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().equals(doctor)) {
                if (appointment.getDate().isBefore(todayDate)) {
                    previousAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getEndTime().isBefore(currentTime)) {
                        previousAppointments.add(appointment);
                    }
                }
            }
        }
        return previousAppointments;
    }

    // checking previous appointments for the room
    public static List<Appointment> getPreviousAppointments(List<Appointment> appointments, Room room) {
        List<Appointment> previousAppointments = new ArrayList<>();
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        for (Appointment appointment : appointments) {
            if (appointment.getRoom().equals(room)) {
                if (appointment.getDate().isBefore(todayDate)) {
                    previousAppointments.add(appointment);
                } else {
                    if (appointment.getDate().isEqual(todayDate) && appointment.getEndTime().isBefore(currentTime)) {
                        previousAppointments.add(appointment);
                    }
                }
            }
        }
        return previousAppointments;
    }

    // method for getting the appointments on a particular date
    public static List<Appointment> getAppointmentsOnDate(List<Appointment> appointments, LocalDate date) {
        List<Appointment> appointmentsResult = new ArrayList<>();

        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                appointmentsResult.add(appointment);
            }
        }

        return appointmentsResult;
    }

}