package DivideAndConqure;

public class mergeSort {
    public static void print(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
            System.out.println();
        }
        public static void mergesort(int nums[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid=si+(ei-si)/2;
            mergesort(nums,si,mid);//left part
            mergesort(nums,mid+1,ei);// right part
            merge(nums,si,mid,ei);
    }
    public static void merge(int []nums,int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for  left part
        int j=mid+1;//iterstion for right part
        int k=0;//iterator for temp nums

        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        //LEFTPART
        while (i<=mid){
            temp[k++]=nums[i++];
        }
//        RIGHT PART
        while(j<=ei){
            temp[k++]=nums[j++];
    }
        for(k=0,i=si;k <temp.length ; k++,i++) {
  nums[i]=temp[k];
        }
    }

    public static void main(String[] args) {
int [] nums={6,2,4,5,1,8};
mergesort(nums,0, nums.length-1);
print(nums);
    }
}
