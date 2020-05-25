//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class Person, holding data fields and methods to access and manipulate them

package project4inheritance;

public class Person {
    //Data fields
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    //Default constructor
    Person(){};

    //Arg constructor
    Person(String name, String address, String phoneNumber, String eMail)
    { this.name = name; this.address = address; this.phoneNumber = phoneNumber; this.eMail = eMail; }

    //getter and setter methods
    String getName()
    {return name;}

    void setName(String name)
    {this.name = name;}

    String getAddress()
    {return address;}

    void setAddress(String address)
    {this.address = address;}

    String getPhoneNumber()
    {return phoneNumber;}

    void setPhoneNumber(String phoneNumber)
    {this.phoneNumber = phoneNumber; }

    String getEMail()
    {return eMail;}

    void setEMail(String eMail)
    {this.eMail = eMail;}

    //Override toString method to print class name and name of person
    @Override
    public String toString(){
        return "The class name is Person and the persons name is: " + name;
    }

}

