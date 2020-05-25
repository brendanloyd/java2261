//Author: Brendan Loyd
//Created: 3-5-2020
//Comp Sci 2261

//This file contains the object for Circle2D
package project3classes;

public class Circle2D {
    private double x, y, radius;                                   //Data fields

    Circle2D()                                                     //Default constructor
    {x=0; y=0; radius = 1;}

    Circle2D(double x, double y, double radius)                    //Arg constructor
    {this.y = y; this.x = x; this.radius = radius;}

   double getX(){return x;}                                        //Getter methods to retrieve values from data fields
   double getY(){return y;}
   double getRadius(){return radius;}
   double getArea(){return (Math.PI * Math.pow(radius, 2));}
   double getPerimeter(){return 2*(Math.PI * radius);}

   boolean contains(double x, double y) {                          //Method checks to see if the point is inside circle
       double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - x, 2));
       if(distance <= radius)
        return true;
       else
           return false;
   }
   boolean contains(Circle2D circle){                             //Method checks to see if the circle is inside circle
       double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
       if(distance <= this.radius - circle.getRadius())
        return true;
       else
           return false;
   }
   boolean overlaps(Circle2D circle){                              //Method checks to see if circles overlap
       double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
       if(distance <= this.radius + circle.getRadius())
        return true;
       else
           return false;
   }
}
