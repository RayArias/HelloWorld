// Class QuadraticEquation for
// program HelloWorld by Ray Arias
// version 1.00.01-delta(rc)-Thales of Miletis
// 03 September 2022

// subpackage: QuadraticFormula, version 1.00.01-delta(rc)-Thales of Miletis
// semantic version 1.0.1-rc

import java.util.Scanner;

public class QuadraticEquation {
    
    double a, b, c;
    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void set(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
      
    public static QuadraticEquation input(Scanner usrInput) {
        QuadraticEquation result = new QuadraticEquation(0, 0, 0);
        TextUI.newln();
        TextUI.displayln("Interactivity and Mathematical Processing Test");
        TextUI.newln();
        TextUI.displayln("Quadratic Formula");
        TextUI.displayln("--------- -------");
        TextUI.newln();
        TextUI.displayln("Given ax² + bx + c = 0,");
        TextUI.newln();
        TextUI.displayln("    -b ± ✓(b² - 4ac)");
        TextUI.displayln("x = -----------------");
        TextUI.displayln("           2a");
        TextUI.newln();
        double aa = 0.0;
        while (aa == 0.0) {
            TextUI.display("Enter a: ");
            aa = TextUI.readdbl(usrInput);
            if (aa == 0.0) TextUI.displayln("This would not result in a quadratic\n" +
                "equation, but a linear or constant equa-\n" +
                "tion instead. Please enter a nonzero\n" +
                "number.");
        }

        TextUI.newln();
        TextUI.display("Enter b: ");
        double bb = TextUI.readdbl(usrInput);
        TextUI.newln();
        TextUI.display("Enter c: ");
        double cc = TextUI.readdbl(usrInput);
        TextUI.newln();
        TextUI.closeUI(usrInput);
        
        result.set(aa, bb, cc);
        return result;
    }
          
    public ComplexDouble[] solve() {
        
        double b2 = this.b * this.b;
        double ab = Math.abs(this.b); // This repairs previous version's err-
                                      // or of using this.b and comparing it
                                      // to 4ac, even when b < 0
        double d2 = 4 * this.a * this.c;
        double d = Math.sqrt(d2);
        boolean complexRoots = (d > ab);
        boolean repeatedRoots = (ab == d);
        ComplexDouble result[] = new ComplexDouble[2];
        result[0] = new ComplexDouble();
        result[1] = new ComplexDouble();
        if (!complexRoots) {
            if (repeatedRoots) {
                TextUI.displayln("There is one repeated solution:");
                result[0].re(-b / (2 * a));
                result[1].re(result[0].re);
            } else { // (!repeatedRoots)
                TextUI.displayln("There are two real solutions:");
                result[0].re((-b + Math.sqrt(b2 - d2)) / (2 * a));
                result[1].re((-b - Math.sqrt(b2 - d2)) / (2 * a));
            }
            result[0].im(0);
            result[1].im(0);
        } else {
            TextUI.displayln("There are two complex solutions:");
            result[0].re(-b / (2 * a));
            result[1].re(result[0].re);
            result[0].im(Math.sqrt(d2 - b2) / (2 * a));
            result[1].im(-result[0].im);
        }
        return result;
    }

        
    public static void showSolutions(ComplexDouble solution[]) {
        TextUI.newln();
        TextUI.displayln("     / " + solution[0].toString());
        TextUI.displayln("x = {");
        TextUI.displayln("     \\ " + solution[1].toString());
    }
    
    public String toString() {
        double a = this.a;
        double b = this.b;
        double c = this.c;
        String result;
        
        if (a == 1) {
            if (b == 1) {
                if (c == 0) result = "x² + x = 0";
                else if (c > 0) result = "x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "x² – x = 0";
                else if (c > 0) result = "x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "x² = 0";
                else if (c > 0) result = "x² + " + c + " = 0";
                else /* (c < 0) */ result = "x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "x² + " + b + "x = 0";
                else if (c > 0) result = "x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "x² + " + b + "x - " + (-c) + " = 0";
            } else { // ((b < 0) && (b != -1))
                if (c == 0) result = "x² – " + (-b) + "x = 0";
                else if (c > 0) result = "x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }
        } else if (a == -1) {
            if (b == 1) {
                if (c == 0) result = "-x² + x = 0";
                else if (c > 0) result = "-x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "-x² – x = 0";
                else if (c > 0) result = "-x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "-x² = 0";
                else if (c > 0) result = "-x² + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "-x² + " + b + "x = 0";
                else if (c > 0) result = "-x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² + " + b + "x - " + (-c) + " = 0";
            } else { // ((b < 0) && (b != -1))
                if (c == 0) result = "-x² – " + (-b) + "x = 0";
                else if (c > 0) result = "-x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }            
        } else if (a == 0) { // linear/constant equaton
            if (b == 1) {
                if (c == 0) result = "x = 0";
                else if (c > 0) result = "x + " + c + " = 0";
                else /* (c < 0) */ result = "x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "-x = 0";
                else if (c > 0) result = "-x + " + c + " = 0";
                else /* (c < 0) */ result = "-x – " + (-c) + " = 0";
            } // Cannot have (b == 0) because for c == 0, equation is tautology (0 == 0),
              // and for c != 0, equation is invalid (ex. 1 == 0)
              // FUTURE TASK: IMPLEMENT EXCEPTION HERE
            else { // ((b != 1) && (b != -1))
                if (c == 0) result = "" + b + "x = 0";
                else if (c > 0) result = "" + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "" + b + "x - " + (-c) + " = 0";
            }
        } else { // ((a != 1) && (a != -1) && (a != 0))
            if (b == 1) {
                if (c == 0) result = "" + a + "x² + x = 0";
                else if (c > 0) result = "" + a + "x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "" + a + "x² – x = 0";
                else if (c > 0) result = "x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "" + a + "x² = 0";
                else if (c > 0) result = "" + a + "x² + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "" + a + "x² + " + b + "x = 0";
                else if (c > 0) result = "" + a + "x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² + " + b + "x - " + (-c) + " = 0";
            } else { // (b < 0) && (b != -1)
                if (c == 0) result = "" + a + "x² – " + (-b) + "x = 0";
                else if (c > 0) result = "" + a + "x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */
                    result = "" + a + "x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }
        }
        return result;
    }
    
       public static String toString(double a, double b, double c) {
        String result;
        
        if (a == 1) {
            if (b == 1) {
                if (c == 0) result = "x² + x = 0";
                else if (c > 0) result = "x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "x² – x = 0";
                else if (c > 0) result = "x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "x² = 0";
                else if (c > 0) result = "x² + " + c + " = 0";
                else /* (c < 0) */ result = "x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "x² + " + b + "x = 0";
                else if (c > 0) result = "x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "x² + " + b + "x - " + (-c) + " = 0";
            } else { // ((b < 0) && (b != -1))
                if (c == 0) result = "x² – " + (-b) + "x = 0";
                else if (c > 0) result = "x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }
        } else if (a == -1) {
            if (b == 1) {
                if (c == 0) result = "-x² + x = 0";
                else if (c > 0) result = "-x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "-x² – x = 0";
                else if (c > 0) result = "-x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "-x² = 0";
                else if (c > 0) result = "-x² + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "-x² + " + b + "x = 0";
                else if (c > 0) result = "-x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² + " + b + "x - " + (-c) + " = 0";
            } else { // ((b < 0) && (b != -1))
                if (c == 0) result = "-x² – " + (-b) + "x = 0";
                else if (c > 0) result = "-x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */ result = "-x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }            
        } else if (a == 0) { // linear/constant equaton
            if (b == 1) {
                if (c == 0) result = "x = 0";
                else if (c > 0) result = "x + " + c + " = 0";
                else /* (c < 0) */ result = "x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "-x = 0";
                else if (c > 0) result = "-x + " + c + " = 0";
                else /* (c < 0) */ result = "-x – " + (-c) + " = 0";
            } // Cannot have (b == 0) because for c == 0, equation is tautology (0 = 0),
              // and for c != 0, equation is invalid (ex. 1 = 0)
            else { // ((b != 1) && (b != -1))
                if (c == 0) result = "" + b + "x = 0";
                else if (c > 0) result = "" + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "" + b + "x - " + (-c) + " = 0";
            }
        } else { // ((a != 1) && (a != -1) && (a != 0))
            if (b == 1) {
                if (c == 0) result = "" + a + "x² + x = 0";
                else if (c > 0) result = "" + a + "x² + x + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² + x – " + (-c) + " = 0";
            } else if (b == -1) {
                if (c == 0) result = "" + a + "x² – x = 0";
                else if (c > 0) result = "x² – x + " + c + " = 0";
                else /* (c < 0) */ result = "x² – x – " + (-c) + " = 0";
            } else if (b == 0) {
                if (c == 0) result = "" + a + "x² = 0";
                else if (c > 0) result = "" + a + "x² + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² – " + (-c) + " = 0";
            } else if (b > 0) { // && (b != 1)
                if (c == 0) result = "" + a + "x² + " + b + "x = 0";
                else if (c > 0) result = "" + a + "x² + " + b + "x + " + c + " = 0";
                else /* (c < 0) */ result = "" + a + "x² + " + b + "x - " + (-c) + " = 0";
            } else { // (b < 0) && (b != -1)
                if (c == 0) result = "" + a + "x² – " + (-b) + "x = 0";
                else if (c > 0) result = "" + a + "x² – " + (-b) + "x + " + c + " = 0";
                else /* (c < 0) */
                    result = "" + a + "x² – " + (-b) + "x – " + (-c) + " = 0"; 
            }
        }
        return result;
    }
}
