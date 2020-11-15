package person;


public class Doctor extends Person { //doctor is a child class of Person super class

    int doctorId;
    String department;

    //default cosntructor
    public Doctor() {
    }

    //parameterized constsructor
    public Doctor(int doctorId) {
        this.doctorId = doctorId;
    }

    // declare getter setter for the Doctor class
    public int getDoctorId() {
        return doctorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
