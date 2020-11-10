package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Load {

    Driver driver;
    LocalDate pickupDate;
    LocalDate deliveryDate;

    String broker;
    String pickupAddress;
    String deliveryAddress;
    int rate;

    public Load(Driver driver, String pickupDate, String deliveryDate, String broker, String pickupAddress, String deliveryAddress, int rate) {

        this.driver = driver;

        //For formatting date strings to LocalDate objects.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        this.pickupDate = LocalDate.parse(pickupDate, formatter);
        this.deliveryDate = LocalDate.parse(deliveryDate, formatter);

        this.broker = broker;
        this.pickupAddress = pickupAddress;
        this.deliveryAddress = deliveryAddress;
        this.rate = rate;
    }
}
