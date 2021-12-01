// Author: Allen Bao
// Date: 10/11
// File: FindingSyntaxErrors 

/* A simple class that contains syntax errors */
public class FindingSyntaxErrors { // No semicolon needed at the end of this line
 
   // The main method 
   public static void main(String[] args) { 
 
      // Declare a variable of type integer
      int zipCode = 98007; 

      // Invoke the print and println methods from System.out 
      System.out.print("Bulldog "); // out should be lowercase
      System.out.println(" is the official mascot of Bellevue College.");
      System.out.println("He lives at zip code " + zipCode); // semicolon needed at the end of these lines
   } 
}

