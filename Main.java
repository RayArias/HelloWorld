// program HelloWorld by Ray Arias
// version 1.00.00-delta(rc)

package HelloWorld;

public class Main {
    
    public static void main(String[] args) {
        TextUI.displayln("Hello, World!");
        
        TextUI.newln();
        TextUI.displayln("Iteration Test");
        for (int i = 0; i < 10; i++) {
            TextUI.display(i);
            if (i < 9) TextUI.display(" < ");
            else TextUI.newln();
        }
        
        TextUI.newln();
        TextUI.displayln("Recursion Test");
        recursionTest(9);
        QuadraticEquation eq = QuadraticEquation.input();
        ComplexDouble[] solution = eq.solve();
        QuadraticEquation.showSolutions(solution);
        TextUI.newln();
        TextUI.displayln("This concludes HelloWorld.");
    }
    
    public static void recursionTest(int n) {
        TextUI.display(n);
        if (n > 0)TextUI.display(" > ");
        else TextUI.newln();
        if (n > 0) recursionTest(n - 1);
    }
    
  }
