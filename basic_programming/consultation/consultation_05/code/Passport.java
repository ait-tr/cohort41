package code;

public class Passport {

    String surName;
    String firstName;
    int year;
    String passportNumber;

    public Passport(String surName, String firstName, int year, String passportNumber) {
        this.surName = surName;
        this.firstName = firstName;
        this.year = year;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "code.Passport{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", year=" + year +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
