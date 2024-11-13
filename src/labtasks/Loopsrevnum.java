package labtasks;
import java.util.*;

public class Loopsrevnum {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        int value=scr.nextInt();
        int rev=0;
        while(value>0)
        {
            int rem=value%10;
            rev=rev*10+rem;
            value=value/10;
        }
        System.out.println(rev);

    }
}
