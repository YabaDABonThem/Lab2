// Allen Bao
// 10/11

// This is a program that takes in a circle's raidus through user input and 
// outputs the circumference. 

import java.util.Scanner;

public class CircumferenceOfCirlce { 
   public static void main(String[] args) { 

      // create Scanner called keyboard
      Scanner keyboard = new Scanner(System.in);

      // Declare the radius variable
		double radius;
     
      // Ask the user to input a number with decimals
      System.out.print("Enter a decimal number, and press enter  ");
      
      // Get the user's input
      radius = keyboard.nextDouble();
     
      // use the formula 2 * pi * r to find the circumference (skips finding diameter)
		double circumference = 2 * Math.PI * radius;

      // Output the result to the screen 
      System.out.println("The circle with radius " + radius + 
            " has a circumference of " + circumference); 
   } 
}

