package string;
import java.util.Scanner;
public class lowercase {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String str=in.next();
        int count=0;

        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e' ||ch=='i'||ch=='o' ||ch=='u'){
                count++;
            }

        }
        System.out.println( "string is :"+count);
    }
}
