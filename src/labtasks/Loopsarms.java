package labtasks;
import java.util.*;
public class Loopsarms {
    public static void main(String[]args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int count = 0;
        int arg = num;
        while (arg > 0) {
            count++;
            arg = arg / 10;
        }

    }


}
