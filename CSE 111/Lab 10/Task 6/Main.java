public class Main {
        public static void main(String[] args) {
                MovablePoint mp = new MovablePoint(4, 7, 10, 3);
                System.out.println(mp);
                mp.moveLeft();
                mp.moveUp();
                System.out.println(mp);
                MovableCircle mc = new MovableCircle(5, 5, 5, 5, 5);
                mc.moveRight();
                mc.moveDown();
                System.out.println(mc);
        }
}