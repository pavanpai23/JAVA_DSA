package recursion;

public class lastOccurance {
    public static int occurance(int []arr,int key,int i){
        if(i== arr.length){
            return -1;
        }
        int isfound=occurance(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
            int [] arr={3,2,5,6,8,7,5,4,3,4,5,7};
        System.out.println(occurance(arr,5,0));
    }
}
