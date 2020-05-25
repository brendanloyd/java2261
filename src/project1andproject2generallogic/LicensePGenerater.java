//Author: Brendan Loyd
//Created: 2-4-2020
//Comp Sci 2261

// this program generates 10 random license plates. Enjoy!
package project1andproject2generallogic;
import java.util.Random;
import java.lang.Math;
public class LicensePGenerater {

    public static void main(String[] args) {

    System.out.println("10 random license plate numbers are:"); //opening statement to be printed in console
    Random rnd = new Random(); // creating and random object

        for(int i = 0; i < 10; i++) // generating random numbers and letters and printing them to the console
        {
            char c1 = (char) (rnd.nextInt(26) + 'A');
            char c2 = (char) (rnd.nextInt(26) + 'A');
            int d = (int) (Math.random() * 10);
            char c3 = (char) (rnd.nextInt(26) + 'A');
            int d2 = (int) (Math.random() * 10);
            char c4 = (char) (rnd.nextInt(26) + 'A');

            System.out.println(c1 + "" + c2 + "" + d + " " + c3 + "" + d2 + "" + c4); // Printing results
        }
    }
}


