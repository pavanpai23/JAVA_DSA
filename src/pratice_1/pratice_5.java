package pratice_1;

public class pratice_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print("");
            }

        System.out.println();
    }
        }
}
