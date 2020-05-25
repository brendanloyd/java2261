//Author: Brendan Loyd
//Created: 3-25-2020
//Comp Sci 2261

//This is class MyDate holding data fields and methods to access and manipulate them

package project4inheritance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyDate {
    //Data fields
    private int year;
    private int month;
    private int day;

    //Default constructor
    MyDate(){
        this.year = GregorianCalendar.YEAR;
        this.month = GregorianCalendar.MONTH;
        this.day = GregorianCalendar.DAY_OF_MONTH;
    }

    //Constructor determining elapsed time from miliseconds into a date
    MyDate(long elapsedTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String startDate = "01-01-1970 00:00:00";// January 1, 1970,
        Date intialDate = sdf.parse(startDate);
        System.out.println("intialdate==" + intialDate);

        Date elapsedDate = new Date(elapsedTime);

        long difference = elapsedDate.getTime() - intialDate.getTime();
        Date finalDate = new Date(difference);
        Calendar cal = Calendar.getInstance();
        cal.setTime(finalDate);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    //Constructor taking in a date
    MyDate(int year, int month, int day)
    {this.year = year; this.month = month; this.day = day;}

    //Getter methods
    int getYear()
    {return year;}

    int getMonth()
    {return month;}

    int getDay()
    { return day; }

    //Set new date
    void setDate(long elapsedTime){
        MyDate myDate = new MyDate();
    }
}
