package loops;
import java.util.*;

public class reversenumber {
    public static void main(String[]args){
        Scanner scr= new Scanner(System.in);
        int num=scr.nextInt();
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println(rev);
    }

}
