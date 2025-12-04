package recursion;

public class firstOccurance {
    public static int occurance(int [] arr,int i,int key){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occurance(arr,i+1,key);
    }
    public static void main(String[] args) {
int [] arr={2,4,5,6,7,4,3,1,5,6};
        System.out.println(occurance(arr,0,5));
    }
}
