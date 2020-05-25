//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class Student extending Person, holding data fields and methods to access and manipulate them

package project4inheritance;

public class Student extends Person{
    //Data field to determine class
    private int status;
    private final static int FRESHMAN = 1;
    private final static int SOPHOMORE = 2;
    private final static int JUNIOR = 3;
    private final static int SENIOR = 4;

    //Default constructor
    Student()
    {status = 0;}

    //multiple arg constructors
    Student(int status)
    {this.status = status;}

    //..
    Student(String name, String address, String phoneNumber, String eMail, int status){
        super(name,address,phoneNumber,eMail);
        this.status = status;
    }

    //Getter method
    String getStatus() {
        switch (status) {
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Unknown";
        }
    }

    //Override toString to print class name and name of person
    @Override
    public String toString(){
        return "The Class name is Student and the persons name is: " +
                getName() + " and " + getName() + " is a " + getStatus();
    }
}

