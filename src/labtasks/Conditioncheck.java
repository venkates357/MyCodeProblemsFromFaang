package labtasks;

public class Conditioncheck {
    public static void main (String[]arg){
        // find even or odd number
        int a=20;
        String result=(a%2==0)?"even number":"odd number";
        System.out.println(result);
        // find bigger and smaller number
        int x=70;
        int y=110;
        String msg=(x<y)?"y is bigger than x":"x is bigger than y";
        System.out.println(msg);

    }
}
