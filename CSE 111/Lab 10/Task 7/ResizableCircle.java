class ResizableCircle  extends Circle implements Resizable {
        public ResizableCircle(double r) {
                super(r);
        }
        
        public void resize(int r) {
                radius *= r;
        }
}