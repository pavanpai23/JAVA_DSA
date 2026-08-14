package pratisecccccc;

public class Direction {
    public static boolean ShortestPath(String path)
    {
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                y--;
            } else if (dir == 'S') {
                x--;
            }

            if (x == y) {
                return true;
            }
        }
       return false;
    }

    public static void main(String[] args) {
String path="NES";
        System.out.println(ShortestPath(path));
    }
}
