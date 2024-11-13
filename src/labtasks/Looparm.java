package labtasks;
import java.util.*;

public class Looparm {
    public static void main(String[]args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int arm = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            arm = arm + rem * rem * rem;
            num = num / 10;

        }
        if (temp == arm)
            System.out.println("Arms strong number");
        else
            System.out.println("not a arms strong number");
    }
}
