package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {

    LocalDate date;
    String merchant;
    String description;
    int cost;

    public Expense(String date, String merchant, String description, int cost) {

        //For formatting date strings to LocalDate objects.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        this.date = LocalDate.parse(date, formatter);
        this.merchant = merchant;
        this.description = description;
        this.cost = cost;
    }
}
