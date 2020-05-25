package project1andproject2generallogic;

import java.util.Scanner;

public class fib2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number and I will return the Fib number: ");
        int number = input.nextInt();
        System.out.println(fib(number));
    }
    static public int fib(int num){
        if(num <= 0) return 0;
        if(num == 1) return 1;

        int result = (num - 1) + (num - 2);

        return result;
    }
}

