package Bitmanupulation;

public class set_ith_bit {
    public static int set_ith(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(set_ith(10,2));
    }
}
