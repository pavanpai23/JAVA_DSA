package pratisecccccc;

public class stringbulider {
    public stringbulider(String s) {

    }

    public static void main(String[] args) {
        stringbulider sb=new stringbulider("");
        for (char ch = 'a'; ch <='z' ; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public void append(char c) {
    }
}
