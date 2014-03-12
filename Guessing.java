
//*******************************************************************
//  Title: Guessing.java      
//  Author: Marquis Davis
//  Description: Guess what the computer is thinking. program generates
//               a random number, and uses a while loop for the to
//               take user guesses until correct
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Guessing
{
   //-----------------------------------------------------------------
//  Plays a simple guessing game with the user.   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int MAX = 10;
      int answer, guess;

      Scanner input = new Scanner (System.in);
      Random generator = new Random();
	  // create a random number between 1 and MAX and store it in answer
      
      answer = generator.nextInt(MAX + 1);


      System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");

      guess = input.nextInt();


// complete the while loop so that the program will keep 
// asking the user to try again until the user's guess 
// is correct
      
      while(guess != answer){

   //print the message    your guess is not correct

         System.out.println("Good Try!...But wrong!");
         
   // ask the user the try again and read in the number
         
         System.out.println("Guess again: ");
         guess = input.nextInt();
	

      }

      
      System.out.println ("You got it! Good guessing!");
      

   }
}
