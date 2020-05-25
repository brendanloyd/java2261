//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class Staff extending Employee that extends Person, holding
// data fields and methods to access and manipulate them

package project4inheritance;

public class Staff extends Employee {
    //Data field
    private String title;

    //Default constructor
    Staff(){}

    //Multiple constructors
    Staff(String name, String title)
    {this.title = title; setName(name);}

    //Crazy constructor but it works
    Staff(String name, String address, String phoneNumber, String eMail, String office,
            double salary, int year, int month, int day, String officeHours, int rank){
        super(name, address, phoneNumber,eMail,office,salary,year,month,day);
        this.title = title;
    }

    //Getter and setter
    public String getTitle()
    { return title; }

    public void setTitle(String title)
    { this.title = title; }

    //Override toString function to print contents in Staff class.
    @Override
    public String toString(){
        return "The class name is Staff and the persons name is: " + getName();
    }
}
