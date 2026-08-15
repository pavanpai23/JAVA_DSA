package pattern;
import java.util.*;
public class solid_Rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
