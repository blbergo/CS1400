import java.io.PrintWriter;
import java.util.Scanner;

//
// Name: Bergo, Bryan
// Homework: 3
// Due: 10/17/22
// Course: cs-1400-03-f22
//
// Description:
//      Program for calculating the total number of entries in a data file as well as there sum and average

import java.io.*;
import java.util.Scanner;

public class StatApp 
{
    public static void main(String[] args) throws IOException
    {
        //intitialize vars
        int count = 0;
        double total = 0;
        double data = 0;

        Scanner kb = new Scanner(System.in);
        
        //required IO
        System.out.println("Stats by B. Bergo\n");

        //get input file name
        System.out.println("Enter the data file name?");
        String filename = kb.nextLine();
        System.out.println();

        //file IO intitialization
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //read file
        while(inputFile.hasNext()) 
        {
            data = inputFile.nextDouble();

            total += data;
            count++;
        }

        inputFile.close();

        //output calculations
        System.out.printf("Count:   %4d \n", count);
        System.out.printf("Total:   %5.2f \n", total);
        System.out.printf("Average: %5.2f", total / count);

        
    }
}