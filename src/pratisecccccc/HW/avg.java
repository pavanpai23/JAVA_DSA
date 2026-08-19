package pratisecccccc.HW;

import java.util.*;
public class avg {

    public static int avggg(int a,int b,int c){
        int sum=(a+b+c)/3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(avggg(a,b,c));
    }
}
