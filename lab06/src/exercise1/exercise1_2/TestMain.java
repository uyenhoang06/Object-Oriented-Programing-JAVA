package exercise1.exercise1_2;

public class TestMain {
    public static void main(String[] args) {
        //person
        Person person1 = new Person("Blue", "TP HCM"); // test constructor
        System.out.println(person1); // test toString()
        System.out.println("person1 name: " + person1.getName()); // test getters
        System.out.println("person1 address: " + person1.getAddress());
        person1.setAddress("Ha Noi"); // test setters
        System.out.println(person1);

        //student
        Student student = new Student("Brown", "HN", "Program", 2022, 10000); // test constructors
        System.out.println(student); // test toString()
        student.setProgram("Math"); // test setter
        System.out.println("student program: " + student.getProgram()); // test getter
        student.setYear(2023);
        System.out.println("year: " + student.getYear());
        student.setFee(15000);
        System.out.println("fee: " + student.getFee());
        System.out.println(student);

        //staff
        Staff staff = new Staff("Yellow", "HN", "School1", 10000); // test constructor
        staff.setPay(15000); // test setters
        staff.setAddress("HN1");
        staff.setSchool("School2");
        System.out.println("Staff's name: " + staff.getName()); // test getters
        System.out.println("Staff's address: " + staff.getAddress());
        System.out.println("Staff's school: " + staff.getSchool());
        System.out.println("Staff's pay: " + staff.getPay());
        System.out.println(staff); // test toString()
    }
}
