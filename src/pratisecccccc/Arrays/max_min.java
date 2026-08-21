package pratisecccccc.Arrays;
import java.util.*;
public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else{
                min=arr[i];
            }


        }
        System.out.println("max is : "+ max);
        System.out.println("min is : "+ min);
    }
}
