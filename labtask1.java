package com.hasib.java.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {
    protected final UUID id;
    protected final String name;
    protected final LocalDate dateOfBirth;

    public Person(String name, int dayOfMonth, int month, int year) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
    }

    protected String calculateAge() {
        final Period diff = Period.between(dateOfBirth, LocalDate.now());
        return diff.getYears() + " Years " +
                diff.getMonths() + " Months " +
                diff.getDays() + " Days ";
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", Age = " + this.calculateAge() + "\n";
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Student("Jayed", 23, 5, 1997));
        personList.add(new Employee("Rafi", 7, 1, 1977));

        personList.forEach(System.out::println);
    }
}

class Student extends Person {
    public Student(String name, int dayOfMonth, int month, int year) {
        super(name, dayOfMonth, month, year);
    }
}

class Employee extends Person {
    public Employee(String name, int dayOfMonth, int month, int year) {
        super(name, dayOfMonth, month, year);
    }
}
