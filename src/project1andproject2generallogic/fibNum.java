package project1andproject2generallogic;
import java.util.Scanner;

public class fibNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number and I will return the Fib number: ");
        int number = input.nextInt();
        System.out.println(fib(number));
    }
    static public int fib(int num){
        if(num <= 0) return 0;
        if(num == 1) return 1;

        int a = 0, b = 1, result = 0;

        for(int i = 1; i < num; i++ ){
            result = a + b;
            a = b;
            b = result;

        }
        return result;
    }
}
