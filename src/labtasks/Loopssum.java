package labtasks;
import java.util.*;
public class Loopssum {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        int value=scr.nextInt();
        int sum=0;
        while(value>0)
        {
           int rem=value%10;
           sum=sum+rem;
           value=value/10;
        }
        System.out.println(sum);
    }
}
