package pratisecccccc.Recursion;

public class reverseString {

    public static void Rever(String s,int idx){
        if(idx==0){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.println(s.charAt(idx));
        Rever(s,idx-1);
    }

    public static void main(String[] args) {
        String s="abcd";
        Rever(s, s.length()-1);
    }

}
