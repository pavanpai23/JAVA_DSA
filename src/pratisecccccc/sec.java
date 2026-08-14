package pratisecccccc;

public class sec {
    public static void main(String[] args) {
        int arr[]={1,9,5,8};
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclargest = largest;

                largest = arr[i];

        }else if(arr[i]>seclargest && arr[i]!=largest) {
                seclargest=arr[i];
            }

        }
        System.out.println("sec lar" +seclargest);
    }
}
