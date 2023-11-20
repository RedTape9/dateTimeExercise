package org.example;

import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate dateOfBirth;

    public Animal(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
