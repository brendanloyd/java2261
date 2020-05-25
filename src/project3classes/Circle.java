//Author: Brendan Loyd
//Created: 3-5-2020
//Comp Sci 2261

//Hello! This program creates an instance of a Circle object and checks area, perimeter, the result of
//c1.contains(3,3), the result of c1.contains(new Circle2D(4,5,10.5),
// and the result of c1.overlaps(new Circle2D(3,5,2.3)... Enjoy!

package project3classes;
import java.text.DecimalFormat;

public class Circle {                                               // Circle class
    public static void main(String[] args){

        DecimalFormat df2 = new DecimalFormat ("0.00");     //DecimalFormat object to clean up decimals
        Circle2D c1 = new Circle2D( 2, 2, 5.5);        //Create an instance of Circle 2D

        System.out.println("The area of the circle is: " + df2.format(c1.getArea()) +     //Print results of Circle2D
                "\nThe perimeter of the circle is: " + df2.format(c1.getPerimeter()) +    //methods
                "\nThe result of c1.contains(3,3) is : " + c1.contains(3,3) +
                "\nThe result of c1.contains(new Circle2D(4,5,10.5) is : " +
                c1.contains(new Circle2D(4,5,10.5)) + "\nThe result of " +
                "c1.overlaps(new Circle2D(3,5,2.3)is : " + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
