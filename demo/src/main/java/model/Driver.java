package model;

import java.time.LocalDate;

public class Driver {

    String firstName;
    String lastName;
    String licenseNumber;
    float commissionRate;

    public Driver(String firstName, String lastName, String licenseNumber, float commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
        this.commissionRate = commissionRate;
    }
}
