package javatopicpratice;

public class Arraybackward {
    public static void main(String[]args) {
        int[] a = {10, 11, 12, 13, 14, 15};
        //array backward
       /* for (int i=a.length-1; i>= 0;i--)
        {
            System.out.println(a[i]);
        }*/
        // find even numbers
        for(int i=0;i<6;i++)
        {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
