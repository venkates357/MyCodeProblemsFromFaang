package array;

public class Sumevn {
    public static void main (String[]args){
        int []a={10,11,12,13,14,15,16};
        int sum=0;
        for(int i=3;i<7 ;i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            System.out.println(sum);
            }
            //System.out.println(sum);
        }
    }
}
