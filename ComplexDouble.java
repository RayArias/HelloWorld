// Class ComplexDouble for
// program HelloWorld by Ray Arias
// version 1.00.00-delta-Tha)es of Miletis
// 27 August 2022

package HelloWorld.QuadraticFormula;

public class ComplexDouble {
    double re;
    double im;
    
    public ComplexDouble() {
        this.re = 0.0;
        this.im = 0.0;
    }
    
    public ComplexDouble(double re) {
        this.re = re;
        this.im = 0.0;
    }
    
    public ComplexDouble(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public void re(double re) {
        this.re = re;
    }
    
    public void im(double im) {
        this.im = im;
    }
    
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public double re() {
        return this.re;
    }
    
    public double im() {
        return this.im;
    }
    
    public ComplexDouble get() {
        return this;
    }
    
    public String toString() {
        String result = "";
        if (im > 0) result = "" + re + " + " + im + "i";
        else if (im < 0) result = "" + re + " – " + (-im) + "i";
        else /* (im == 0) */ result = "" + re;
        return result;
    }
}
