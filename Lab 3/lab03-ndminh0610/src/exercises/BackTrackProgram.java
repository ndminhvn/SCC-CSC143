package exercises;

public class BackTrackProgram {

    public static void goNorthEast(int endX, int endY) {
        goNorthEast(endX, endY, 0, 0, "moves:");
    }

    private static void goNorthEast(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x <= endX && y <= endY){
            goNorthEast(endX, endY, x, y + 1, route + " N");
            goNorthEast(endX, endY,x + 1, y, route + " E");
            goNorthEast(endX, endY,x + 1, y + 1, route + " NE");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goSouthWest(int endX, int endY, int startX, int startY) {
        goSouthWest(endX, endY, startX, startY, "moves:");
    }

    private static void goSouthWest(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x >= endX && y >= endY){
            goSouthWest(endX, endY, x, y - 1, route + " S");
            goSouthWest(endX, endY,x - 1, y, route + " W");
            goSouthWest(endX, endY,x - 1, y - 1, route + " SW");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void main(String[] args) {
        System.out.println();
        goNorthEast(2,1);
        System.out.println();
        goSouthWest(0,0,2,1);
    }
}
