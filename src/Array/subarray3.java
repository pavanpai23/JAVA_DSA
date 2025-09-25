package Array;

public class subarray3 {
        public static void kadans(int num[]) {
            int curr = 0;
            int max = Integer.MIN_VALUE;

            int ms= Integer.MIN_VALUE; 
            int cs=0;
            for (int i = 0; i < num.length; i++) {
                cs = cs + num[i];
                if (cs < ms) {
                    cs = 0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("our max subarray sum is:"+ms);
            }



        public static void main(String[] args) {
            int num[] = {2, 4, 6, 8, 10};
        kadans(num);
        }

    }
