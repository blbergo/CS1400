//
// Name: Bergo, Bryan
// Project: 2
// Due: 10/5/22
// Course: cs-1400-03-f22
//
// Description:
//  Guessing Game where users guess a number between 1 and 100 until they get it correct

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);

        //set random seed 
        if(args.length > 0) 
        {
            rand.setSeed(Long.valueOf(args[0]));
        }

        int secretNumber = 0;

        //ensure that are number does not land on 0
        while(secretNumber == 0) 
        {
            secretNumber = rand.nextInt(101);
        }

        int guessCount = 1;
        
        System.out.println("Guess My Number Game by B. Bergo \n");
        System.out.println("A secret number between 1-100 has been generated...\nEnter guess 0 to quit");

        System.out.println("Enter your guess?");
        int currentGuess = kb.nextInt();
        
        //check if first guess is correct
        if(currentGuess != secretNumber) 
        {
            //guess loop
            while(currentGuess != 0 && currentGuess != secretNumber) 
            {
                if(currentGuess > secretNumber) 
                {
                    //scenario 1
                    System.out.print("Guess is high, try again.\n");
                } else 
                {
                    //scenario 2
                    System.out.print("Guess is low, try again.\n");
                }

                //increment guess counter
                guessCount += 1;

                //get next guess
                System.out.println("Enter your guess?");
                currentGuess = kb.nextInt();
            }

            if(currentGuess == 0) 
            {
                //scenario 4
                System.out.println("The secret number is " + secretNumber + ".");
            } else 
            {
                //scenario 3
                System.out.println("Correct in " + guessCount + " guesses.");
            }

            
        } else 
        {
            //scenario 5
            System.out.println("Congratulations, you got it in 1 guess!");
        }
        


    }
}