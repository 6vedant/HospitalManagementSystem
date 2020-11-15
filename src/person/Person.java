package person;

import java.time.LocalDate;

public class Person {
    // variables
    String firstName;
    String middleName;
    String lastName;

    // full name which will be the concatenated string ie- firstName + middleName + lastName
    String fullName;

    boolean female;

    LocalDate dateOfBirth;

    String homeAddress;
    String emailAddress;
    String phoneNumber;

    // setters and getters for the declared variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isFemale() {
        return female;
    }

    public void setGender(boolean female) {
        this.female = female;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName, String middleName, String lastName) {
        this.fullName = firstName + " " + middleName + " " + lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
