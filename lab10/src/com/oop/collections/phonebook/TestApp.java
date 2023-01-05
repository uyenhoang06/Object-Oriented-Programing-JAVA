package com.oop.collections.phonebook;

public class TestApp {
    public static void main(String[] args) {
        //phone book list
        PhoneBook pb1 = new PhoneBookList();
        pb1.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb1.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb1.addPerson(new Student("Lusia", "Poppi", "24564"));

        System.out.println(pb1.searchByName("Marco"));
        System.out.println(pb1.searchByLastName("Poppi"));

        System.out.println(pb1.searchByNumber("1111"));

        pb1.deleteByNumber("24564");
        System.out.println(pb1.searchByLastName("Poppi"));

        //phone book map
        PhoneBook pb2 = new PhoneBookMap();
        pb2.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb2.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb2.addPerson(new Student("Lusia", "Poppi", "24564"));

        System.out.println(pb2.searchByName("Marco"));
        System.out.println(pb2.searchByLastName("Poppi"));

        System.out.println(pb2.searchByNumber("1111"));

        pb2.deleteByNumber("24564");
        System.out.println(pb2.searchByLastName("Poppi"));
    }
}
