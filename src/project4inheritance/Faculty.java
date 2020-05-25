//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class Faculty extending Employee that extends Person, holding data fields and methods to access and manipulate them

package project4inheritance;

public class Faculty extends Employee{
    //DataFields
    private String officeHours;
    private int rank;

    //Default constructor
    Faculty(){}

    //Multiple constructors
    Faculty(String officeHours, int rank)
    {this.officeHours = officeHours; this.rank = rank; }

    //..
    Faculty(String name, String officeHours, int rank)
    {setName(name); this.officeHours = officeHours; this.rank = rank; }

    //..
    Faculty(String name, String address, String phoneNumber, String eMail, String office,
             double salary, int year, int month, int day, String officeHours, int rank){
        super(name, address, phoneNumber,eMail,office,salary,year,month,day);
        this.officeHours = officeHours; this.rank = rank;
    }

    //Getter and setter methods
    public String getOfficeHours()
    { return officeHours; }

    public void setOfficeHours(String officeHours)
    { this.officeHours = officeHours; }

    public int getRank()
    { return rank; }

    public void setRank(int rank)
    { this.rank = rank; }

    //Override the toString method per instruction
    @Override
    public String toString(){
        return "The class name is Faculty and the persons name is: " + getName();
    }
}
