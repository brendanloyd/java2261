//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This file created instances of Person, Student, Employee, Staff, and Faculty and prints each individual
//Overridden toString method including the name of the class and name of the person.

package project4inheritance;

public class TestPersonInheritance {
    public static void main(String[] args){

        //Create an instance of Person
        Person testPerson = new Person("Bob", "5228 Seckman",
                "555-555-555", "email@gmail.com");

        //Create an instance of Student
        Person testStudent = new Student("Kelly", "1234 Circle lane",
                "111-111-1111","theEmail@gmail.com", 1);

        //Create an instance of Employee
        Person testEmployee = new Employee("Kyle", "111 lane ct", "222-222-2222",
                "thatEmail@gmail.com", "ES4" , 22, 1993, 01, 05  );

        //Create an instance of Staff(also simplified constructors)
        Person testStaff = new Staff("Paige", "Software Master");

        //Create an instance of Faculty
        Person testFaculty = new Faculty("Brendan", "monday-friday 8-5pm",1);

        //Print each overridden toString method
        System.out.println(testPerson);
        System.out.println(testStudent);
        System.out.println(testEmployee);
        System.out.println(testFaculty);

    }
}
