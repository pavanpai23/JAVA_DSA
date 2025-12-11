package DivideAndConqure;

public class mergeSort {
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
            System.out.println();
        }
        public static void mergesort(int arr[],int si,int ei){
            if(si<=ei){
                return;
            }
            int mid=si+(ei-si)/2;
            mergesort(arr,si,ei);//iterator foe left part
            mergesort(arr,mid+1,ei);

    }
    public static void main(String[] args) {

    }
}
