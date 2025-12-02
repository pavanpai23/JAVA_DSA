package arrays_2d;

public class integer {
    public static void main(String[] args) {
        int arr[]={6,-4,-2,0,-4,7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("positive");
                System.out.println(arr[i]);
            } else if (arr[i] < 0) {
                System.out.println("negative");
                System.out.println(arr[i]);
            } else if (arr[i] == 0) {
                System.out.println("zeros");
                System.out.println(arr[i]);
            }
        }            }
}
