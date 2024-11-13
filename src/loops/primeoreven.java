package loops;
import java.util.*;
public class primeoreven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int value = scr.nextInt();
        int count = 0;
       /* for (int i = 1; i <= value; i++) {
            if (value % i == 0)
                count++;
        }
                if (count == 2)
                    System.out.println("primenumber");

                else
                    System.out.println("not prime");*/


/*for (int n=1;n<=value/2;n++){
    if(value%n==0)
        count++;

}
if(count==1)
    System.out.println("prime");*/
        for (int y = 1; y <= value; y++) {
            if (y % 2 == 0)
        System.out.println("prime");

        }
    }
}