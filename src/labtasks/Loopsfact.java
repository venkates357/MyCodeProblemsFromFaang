package labtasks;
import java.util.*;
public class Loopsfact {
    public static void main(String[]args) {
        // take the input from scanner

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt ();
        // variables declaration & initialization
        int i = 1;
        int fact = 1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(" factorials of number " +fact);
    }
}

 //int fact = 1;
//for(int i=1; i<=num; i++)
//fact = fact *i;
