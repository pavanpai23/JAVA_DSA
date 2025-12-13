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
            mergesort(arr,si,ei);//left part
            mergesort(arr,mid+1,ei);// right part
            merge(arr,si,mid,ei);
    }
    public static void merge(int []arr,int si,int mid,int ei){
        int temp[]=new int[si-ei+1];
        int i=si;//iterator for  left part
        int j=mid+1;//iterstion for right part
        int k=0;//iterator for temp arr

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while(j>=mid){
            temp[k++]=arr[j++];
    }
    }

    public static void main(String[] args) {

    }
}
