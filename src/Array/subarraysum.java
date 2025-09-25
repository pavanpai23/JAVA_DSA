package Array;

public class subarraysum {
        public static void subarrayssum(int num[]) {
            int curr = 0;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < num.length; i++) {
                int start = i;
                for (int j = i; j < num.length; j++) {
                    int end = j;
                    curr = 0;
                    for (int k = start; k <= end; k++) {
                        curr += num[k];
                    }
                    System.out.println(curr);

                    if (max < curr) {
                        max = curr;
                    }
                }
            }
            System.out.println("max =" +max);
        }
        public static void main(String[] args) {
            int num[]={2,4,6,8,10};
            subarrayssum(num);
        }
    }
