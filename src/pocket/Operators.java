package pocket;
//operators excercise
public class Operators {
    public static void main( String[]arg){
        int a =20;
        int b =30;
        int sum=a+b;
         System.out.println("sum: "+sum);
         System.out.println("Mult: "+a*b);
         System.out.println(a-10);
         System.out.println(a*4);
        System.out.println(b/3);
         System.out.println(b%3);
         System.out.println("---------------");
         //ASM OPERATORS
        int x=20;
        System.out.println("value of x = "+x);
        x+=30;//it's mean x= x+30--->20+30=50
        System.out.println("value of x= "+x);
        //exmple 2
        int z=30;
        System.out.println("value of z= "+z);
        z*=40;
    System.out.println("value of z= "+z);
    System.out.println("--------");
    //Relational operators /Comparison operators--->
        int k=80;
        int l=60;
        System.out.println(k<l);
        System.out.println(k<60);
        System.out.println(k>l);
        System.out.println(k<=l);
        System.out.println(k<=100);
        System.out.println(k==l);
        System.out.println(k!=20);
        System.out.println("---------");
        // logical operators
        int m=10;
                int n=15;
        System.out.println(m<n && 50>n);
        System.out.println(m>n || n==15);
        System.out.println(m>100);
        // unary operators
        int H=20;
        System.out.println("H: "+H);
        H++;
        System.out.println("H: "+H);
        H++;
        System.out.println("H: "+H);
        System.out.println("------------------- ");
        int G=40;
        System.out.println("G: "+G);
        G--;
        System.out.println("G: "+G);
        G--;
        System.out.println("G: "+G);


    // ternary operator;
     int p=50;
        int v=70;
        int max=p>v ? p:v;
        System.out.println("maximun of "+p+" & "+v+" is "+max);
        // exmaple
        int s=30;
                int t=60;
                        int min=t>s ?s:t;
        System.out.println("minimum of  " +s+ "  & " +t+  " is "+min);




    }
}
