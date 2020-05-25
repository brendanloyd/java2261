//Author : Brendan Loyd
//Created: 2-5-2020
//Comp Sci 2261

//This program gathers two strings from the user and determines if there is a common prefix.

package project1andproject2generallogic;
import java.util.Scanner;

public class StringPrefix {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //create scanner object and String prefix object
        String prefix = "";

        System.out.println("Please enter a string: "); // gather both strings from user
        String s1 = input.nextLine();
        System.out.println("Please enter a second string:");
        String s2 = input.nextLine();

        for(int i = 0 ; i <= s1.length(); i++) {   // compare the two strings for a common prefix
            if (s1.charAt(i) == s2.charAt(i))
                prefix += s1.charAt(i);
            else
                break;
        }

        if(!prefix.equals(""))      //If there is a common prefix, print it, if not, print there is no common prefix
            System.out.print("The common prefix is: " + prefix);
        else
            System.out.print("There was no common prefix.");
    }
}
