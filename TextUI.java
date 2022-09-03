// Class TextUI for program HelloWorld
// version 1.01.00-gamma by Ray Arias
// 27 August 2022

package HelloWorld;

import java.util.Scanner;

/* This is a class of static methods for
 * obtaining user input, displaying out-
 * put, and converting one datatype to
 * another.
 */
public class TextUI {
  
  // Creates and initializes a Scanner
  // object in from java.init.Scanner
  // and returns its reference.
  public static Scanner openUI() {
    Scanner result = new Scanner(System.in);
    return result;
  }
  
  // Reads a String of input from the user
  // using the Scanner object and returns
  // it.
  public static String readln(Scanner scanner) {
    String result = scanner.nextLine();
    return result;
  }

  // Reads a double from the user using
  // the Scanner object and returns it.
  public static double readdbl(Scanner scanner) {
    double result = scanner.nextDouble();
    return result;
  }

  // Reads an int from the user using
  // the Scanner object and returns it.
  public static int readint(Scanner scanner) {
    int result = scanner.nextInt();
    return result;
  }
  
  // Closes the Scanner object.
  public static void closeUI(Scanner scanner) {
    scanner.close();
  }
  
  // Uses the above methods to quickly
  // create an instance of Scanner
  // class, use it to read a line of
  // user input, close the Scanner in-
  // stance, and return the input as a
  // String.
  public static String quickReadln() {
    Scanner scanner = TextUI.openUI();
    String result = TextUI.readln(scanner);
    TextUI.closeUI(scanner);
    return result;
  }	
  
  // This method returns the numerical
  // value of a char as an int.
  public static int char2int(char c) {
    return Character.getNumericValue(c);
  }
  
  // This method returns the ANSI char
  // associated with the int given as a
  // parameter.
  public static char chr(int i) {
    return (char) i;
  }
  
  // Displays char (no newline, unless)
  // c is '\n'.
  public static void chr(char c) {
  System.out.print(c);
  }	

  // Displays escape codes by passing
  // only the character associated with
  // them without the backward slash be-
  // fore it.
  public static void escchr(char c) {
    char cc = c;
    switch (cc) {
      
      case '\\':
        System.out.print('\\');
        break;
      
      case '\"':
        System.out.print('\"');
        break;
      
      case '\'':
        System.out.print('\'');
        break;
      
      case 'n':
        System.out.print('\n');
        break;
      
      case 't':
        System.out.print('\t');
        break;
      
      case 'r':
        System.out.print('\r');
        break;
      
      case 'b':
        System.out.print('\b');
        break;
      
      case 'f':
        System.out.print('\f');
        break;
    }
  }
  
  // Display newline
  public static void newln() {
    System.out.println();
  }
  
  // Displays String specified in
  // parameter without going to a
  // new line at the end.
  public static void display(String text) {
    System.out.print(text);
  }

  // Displays int specified in
  // parameter without going to a
  // new line at the end.
  public static void display(int i) {
    System.out.print(i);
  }
  
  // Displays double specified in
  // parameter without going to a
  // new line at the end.
  public static void display(double d) {
    System.out.print(d);
  }

  // Displays String specified in
  // patameter and then go to a
  // new line afterward.
  public static void displayln(String text) {
    System.out.println(text);
  }
  
  // Displays int specified in
  // patameter and then go to a
  // new line afterward.
  public static void displayln(int i) {
    System.out.println(i);
  }
  
  // Displays double specified in
  // patameter and then go to a
  // new line afterward.
  public static void displayln(double d) {
    System.out.println(d);
  }
  
  // Displays an int and a String in
  // the format expressed in the first
  // String.
  public static void dispf(String format, int n, String description) {
    System.out.printf(format, n, description);
  }
  
  // Extracts the user's choice as the
  // first character in the String typed
  // in by the user.
  public static char userChoice(String inputString) {
    char result = inputString.toUpperCase().charAt(0);
    return result;
  }

}

