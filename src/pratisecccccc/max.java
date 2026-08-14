package pratisecccccc;

public class max {
    public static void main(String[] args) {
        int arr[]={1,1,3,5,3,6,1,1,3};
        int maxcount=0;
        int maxelem=arr[0];

        for(int i=0;i<arr.length;i++){
            int count=0;

            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                maxelem=arr[i];
            }


        }
        System.out.println("max is : " +maxelem);
    }
}
