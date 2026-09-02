package pratisecccccc.Stringbuilder;

public class stringbilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Hello");
//        System.out.println(s);
//     print sTony
//       s.insert(0,'s');
//        System.out.println(s);

        //print tonny
//        s.insert(2,'n');
//        System.out.println(s);


        //reverse
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
