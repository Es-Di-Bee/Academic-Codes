public class Main {
        public static void main (String[] args) {
                Guitar g = new Guitar();
                Keyboard k = new Keyboard();
                Violin v = new Violin();
                
                g.play();
                g.compose();
                g.adjust();
                
                k.play();
                k.compose();
                k.adjust();
                
                v.play();
                v.compose();
                v.adjust();
        }
}