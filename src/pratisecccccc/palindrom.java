package pratisecccccc;
import java.util.*;


public class palindrom {

    public static boolean isP(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
            return true;
    }


    public static void main(String[] args) {
        String str="RACE to Car";
        System.out.println(isP(str));
            }
        }

