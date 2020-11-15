package person;


public class Patient extends Person { // inheritance used, Person is the parent class for Patient class.

    //declaring variables
    int patientId;

    Doctor assignedDoctor;

    //parameterized constructor
    public Patient(int patientId) {
        this.patientId = patientId;
    }

    // create getter and setter for the declared variables
    public int getPatientId() {
        return patientId;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }
}
