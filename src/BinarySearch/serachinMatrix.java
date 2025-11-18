package BinarySearch;

public class serachinMatrix {
    public static void main(String[] args) {

    }
    static int binarysearch(int [][]matrix,int row,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[row][mid]==target){

            }
            if(matrix[row][mid]<target){
                 start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
    static int search(int [][]arr,int target){

    }
}
