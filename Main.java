// program HelloWorld by Ray Arias
// version 1.00.02-delta(rc)-Hola/Java 11
// 03 September 2022

// semantic version 1.0.2-rc

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        TextUI.clrscn();
        TextUI.displayln("HelloWorld, version 1.00.02-delta(rc)-Hola/Java 11");
        TextUI.displayln("By Ray Arias, (minor revision) 03 September 2022.");
        TextUI.newln();
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
        TextUI.newln();
        TextUI.displayln("This is the end of the first part of two\n" +
            "of program HelloWorld. Please press\n" +
            "ENTER to continue.");
        Scanner usrInput = TextUI.openUI();
        TextUI.readln(usrInput);
        TextUI.clrscn();
        
        QuadraticEquation eq = QuadraticEquation.input(usrInput);
        TextUI.displayln("For " + eq.toString() + ",");
        ComplexDouble[] solution = eq.solve();
        QuadraticEquation.showSolutions(solution);
        TextUI.newln();
        TextUI.displayln("This concludes the second part and the\n" +
            "program HelloWorld.");
    }
    
    public static void recursionTest(int n) {
        TextUI.display(n);
        if (n > 0)TextUI.display(" > ");
        else TextUI.newln();
        if (n > 0) recursionTest(n - 1);
    }
    
  }
