public class Complex {
    private double realPart = 0.0;
    private double imaginaryPart = 0.0;
    public Complex() {
    }
    public Complex(double r, double i) {
        this.realPart = r;
        this.imaginaryPart = i;
    }
    public void setRealPart(double r) {
        this.realPart = r;
    }
    public void setImaginaryPart(double i) {
        this.imaginaryPart = i;
    }
    public double getRealPart() {
        return realPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public String toString() {
        if (this.imaginaryPart > 0) return String.format("%.1f + %.1fi", this.realPart, this.imaginaryPart);
        return String.format("%.1f - %.1fi", this.realPart, Math.abs(this.imaginaryPart));
    }
    public Complex add(Complex otherNumber) {
        double sum_of_real_part = this.realPart + otherNumber.realPart;
        double sum_of_imaginary_part = this.imaginaryPart + otherNumber.imaginaryPart;
        Complex temp = new Complex(sum_of_real_part, sum_of_imaginary_part);
        return temp;
    }
    public Complex subtract(Complex otherNumber) {
        double dif_of_real_part = this.realPart - otherNumber.realPart;
        double dif_of_imaginary_part = this.imaginaryPart - otherNumber.imaginaryPart;
        Complex temp = new Complex(dif_of_real_part, dif_of_imaginary_part);
        return temp;
    }
    public Complex multiply(Complex otherNumber) {
        double prod_of_real_part = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart);
        double prod_of_imaginary_part = (this.realPart * otherNumber.imaginaryPart) + (this.imaginaryPart * otherNumber.realPart);
        Complex temp = new Complex(prod_of_real_part, prod_of_imaginary_part);
        return temp;
    }
    public Complex divide (Complex otherNumber) { // this method returns an object
        double denominator = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
        double numerator1 = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart * -1); 
        double numerator2 = (this.realPart * otherNumber.imaginaryPart * -1) + (this.imaginaryPart * otherNumber.realPart);
        double div_of_real_part = numerator1 / denominator;
        double div_of_imaginary_part = numerator2 / denominator;
        Complex temp = new Complex(div_of_real_part, div_of_imaginary_part);
        return temp;
    }
}