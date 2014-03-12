//***************************************************************
//File: IdealWeight.java
//Author: Marquis Davis
//Purpose: Determine the ideal weight of a male and female over 5'
//given the height of that individual
//***************************************************************
import java.util.Scanner;


public class IdealWeight
{

   public static void main(String args[])
   {
   
    // declare constants: 5' in inches, male and female
    // ideal weight at 5'
    
      final int OVER5 = 60;
      final int FEMLB = 100;
      final int MALELB = 106;
      
    //  declare height in feet and inches and an expression that gives height
    //  in just inches
    
      int heightFt, heightIn;
      int totIn;
      
    // declare calculation variables to determine ideal weight of male and female
    
      int calcFemLb, calcMaleLb;  
      
    //create scanner for input
    
      Scanner input = new Scanner(System.in);  
      
      
    
    //prompt trying to explain that I need to collect the height seperately
    
      System.out.println("To calculate your ideal weight I will need to know your" +
         " \nheight and will collect the feet and leftover inches seperately..");
         
    //Prompt for and read in the height and inches     
         
      System.out.println("Feet aspect of height: ");
    
      heightFt = input.nextInt();
    
      System.out.println("Leftover inches: ");
    
      heightIn = input.nextInt();
    
    //Convert height to inches
    
      totIn = (heightFt * 12) + heightIn;
    
    //Calculate ideal weight for male and female with given height
    
      calcFemLb = 5 * (totIn - OVER5) + FEMLB;
      
      calcMaleLb = 6 * (totIn - OVER5) + MALELB;
    
     
    //Show results
    
    System.out.println("At a height of " + heightFt + "'" + heightIn +
                       "\" the ideal weight of a female is " + calcFemLb + "lbs" + 
                       " \nand for a male is " + calcMaleLb + "lbs.");
    
    
   
   }


}