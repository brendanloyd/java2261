//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class Student extending Employee extending Person, holding data fields and methods to access and manipulate them

package project4inheritance;

public class Employee extends Person{
    //Data fields
    private String office;
    private double salary;
    private MyDate dateHired;

    //Default constructors
    Employee(){}

    //Multiple arg constructors
    Employee(String office, double salary)
    {this.office = office; this.salary = salary;}

    //..
    Employee(String office, double salary, int year, int month, int day)
    {this.office = office; this.salary = salary; setDateHired(year,month,day);}

    //..
    Employee(String name, String address, String phoneNumber, String eMail, String office,
             double salary, int year, int month, int day){
        super(name, address, phoneNumber, eMail);
        this.office = office; this.salary = salary; setDateHired(year,month,day);
    }

    //Getter and setter methods
    String getOffice()
    {return office;}

    void setOffice(String office)
    {this.office = office;}

    double getSalary()
    {return salary;}

    void setSalary(double salary)
    {this.salary = salary;}

    MyDate getDateHired()
    {return dateHired;}

    void setDateHired(int year, int month, int day)
    {this.dateHired = new MyDate(year, month, day);}

    //Overrride toString method to print name of class and name of person
    @Override
    public String toString(){
        return "The class name is Employee and the persons name is: " + getName();
    }

}

