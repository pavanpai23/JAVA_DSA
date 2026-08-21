package pratisecccccc.HW;
import java.util.*;
public class array_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int key= sc.nextInt();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}
