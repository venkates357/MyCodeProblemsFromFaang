package labtasks;
import java.util.*;
public class Loopsplndrm {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        int num=scr.nextInt();
        int reverse=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(temp==reverse)
            System.out.println("polindrom");
        else
            System.out.println("not a polindrom");


    }
}
