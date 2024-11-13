package labtasks;

import java.util.Scanner;

public class Swapwithout3Var {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the no :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(" with out Swap no x:"+x+" y "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Swap no x:"+x+" y "+y);
    }
}
