//Author: Brendan Loyd
//Created: 4-15-2020
//Comp Sci 2261

//This program compares traversing a LinkedList with an iterator vs the .get() method
package project5collectioninterface;
import java.util.*;

public class linkedListTime {
    public static void main(String[] args){

        //Create variables
        final int FIVEMIL = 5000000;
        long startTime, endTime, duration;

        //Create and store values in an ArrayList
        List<Integer> aList = new ArrayList<>();
        for(int i = 0; i < FIVEMIL; i++){
            aList.add(i);
        }
        //Create a LinkedList of the ArrayList and an ListIterator to traverse the list
        LinkedList <Integer> list = new LinkedList<>(aList);
        ListIterator<Integer> listIterator =  list.listIterator();

        //Record time it takes to traverse list with a ListIterator, then print time
        startTime = System.nanoTime();
        while(listIterator.hasNext()){
            listIterator.next();

        }
        endTime = System.nanoTime();

        //Determine time with methodToTime method and print
        duration = methodToTime(startTime,endTime);
        System.out.println("The listIterator took: " + duration);

        //Record time it takes to traverse list with the .get() method, then print time
        startTime = System.nanoTime();
        for(int index = 0; index < FIVEMIL; index++)
        list.get(index);
        endTime = System.nanoTime();

        //Determine time with methodToTime method and print
        duration = methodToTime(startTime,endTime);
        System.out.println("The get() took: " + duration);
    }

    public static long methodToTime(long startTime, long endTime){

        return (endTime - startTime);
    }
}
