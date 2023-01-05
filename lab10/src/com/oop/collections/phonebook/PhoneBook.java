package com.oop.collections.phonebook;

public interface PhoneBook {
    Student searchByLastName(String lastname);

    Student searchByNumber(String phone);

    void addPerson(Student s);

    Student searchByName(String name);

    void deleteByNumber(String phone);
}
