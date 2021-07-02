public class ComplexNumber extends RealNumber {
        double complexValue = 0.0;
        public ComplexNumber() {
                setRealValue(1.0);
                complexValue = 1.0;
        }
        public ComplexNumber(double r, double i) {
                setRealValue(r);
                complexValue = i;
        }
        public void check() {
                System.out.println("I'm in ComplexNumber class");
                ping();
                System.out.println("Checking ended.");
        }
        public String toString() {
              return String.format("RealPart: %.1f%nImaginaryPart: %.1f", getRealValue(), complexValue);
        }
}