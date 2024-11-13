package labtasks;

public class Lpsptrnrev {
    public static void main(String[]args){
       // int n=5;
        int l=1;
        for(int i=1;i<=4;i++){
            /*for(int k=5-i;k>=1;k--)
                System.out.print(" ");*/
            for (int j=1;j<=i;j++,l++)
                System.out.print(l+" ");
            System.out.println();
        }
    }

}
