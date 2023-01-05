package com.oop.library;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(average, s.average);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student) || o == null) {
            return false;
        }
        return Double.compare(student.average, average) == 0 && Objects.equals(name, student.name) && Objects.equals(lastname, student.lastname) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", phone='" + phone + '\'' + ", average=" + average + ']';
    }
}
